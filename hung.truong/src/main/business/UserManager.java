package main.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import main.business.services.UserCommandManager;
import main.business.services.UserQueryManager;
import main.domain.ExecutionResult;
import main.domain.ExecutionResult.Status;
import main.domain.ResponseData;
import main.domain.User;

@Component
public class UserManager {

	@Autowired
	private UserQueryManager queryManager;

	@Autowired
	private UserCommandManager commandManager;

	public List<User> getAllUsers() {
		return queryManager.getAllUser();
	}

	public ResponseData addUser(User user) {
		ExecutionResult result = commandManager.insert(user);
		ResponseData.Builder builder = ResponseData.builder().success(result.getResult() == Status.Success);
		if (result.getResult() != Status.Success) {
			builder.status(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return builder.build();
	}

	public ResponseData getUserById(long userId) {
		User user = queryManager.getUserById(userId);
		ResponseData.Builder builder = ResponseData.builder();
		if (user == null) {
			builder.status(HttpStatus.BAD_REQUEST).success(false).message("User not found!");
		}
		builder.data(user);
		return builder.build();
	}

	public ResponseData editUser(User user) {
		User oldUser = queryManager.getUserById(user.getUserId());
		if (oldUser == null) {
			return ResponseData.builder().status(HttpStatus.BAD_REQUEST).success(false).message("User not found!")
					.build();
		}
		ExecutionResult result = commandManager.edit(user);
		ResponseData.Builder builder = ResponseData.builder().success(result.getResult() == Status.Success);
		if (result.getResult() != Status.Success) {
			builder.status(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return builder.build();
	}

	public ResponseData deleteUser(long userId) {
		User oldUser = queryManager.getUserById(userId);
		if (oldUser == null) {
			return ResponseData.builder().status(HttpStatus.BAD_REQUEST).success(false).message("User not found!")
					.build();
		}
		ExecutionResult result = commandManager.delete(userId);
		return ResponseData.builder().success(result.getResult() == Status.Success).build();
	}

	public ResponseData getUserByName(String name) {
		return ResponseData.builder().data(queryManager.getUserByUsername(name)).build();
	}
}
