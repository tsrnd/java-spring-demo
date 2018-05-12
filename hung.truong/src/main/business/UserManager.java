package main.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import main.dataaccess.UserRepository;
import main.domain.ResponseData;
import main.domain.User;

@Component
public class UserManager {

	@Autowired
	private UserRepository repository;

	public List<User> getAllUsers() {
		return repository.findAll();
	}

	public ResponseData addUser(User user) {
		boolean success = repository.save(user) != null;
		ResponseData.Builder builder = ResponseData.builder().success(success);
		if (!success) {
			builder.status(HttpStatus.BAD_REQUEST);
		}
		return builder.build();
	}

	public ResponseData getUserById(long userId) {
		User user = repository.findOne(userId);
		ResponseData.Builder builder = ResponseData.builder();
		if (user == null) {
			builder.status(HttpStatus.BAD_REQUEST).success(false).message("User not found!");
		}
		builder.data(user);
		return builder.build();
	}

	public ResponseData editUser(User user) {
		User oldUser = repository.findOne(user.getUserId());
		if (oldUser == null) {
			return ResponseData.builder().status(HttpStatus.BAD_REQUEST).success(false).message("User not found!")
					.build();
		}
		boolean success = repository.save(user) != null;
		ResponseData.Builder builder = ResponseData.builder().success(success);
		if (!success) {
			builder.status(HttpStatus.BAD_REQUEST);
		}
		return builder.build();
	}

	public ResponseData deleteUser(long userId) {
		User oldUser = repository.findOne(userId);
		if (oldUser == null) {
			return ResponseData.builder().status(HttpStatus.BAD_REQUEST).success(false).message("User not found!")
					.build();
		}
		repository.delete(userId);
		return ResponseData.builder().build();
	}
}
