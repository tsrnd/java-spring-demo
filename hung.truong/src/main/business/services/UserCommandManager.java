package main.business.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import main.dataaccess.provider.UserCommandProvider;
import main.domain.ExecutionResult;
import main.domain.entity.User;

@Component
public class UserCommandManager {

	@Autowired
	private UserCommandProvider provider;
	
	public ExecutionResult insert(User user) {
		return provider.addUser(user);
	}
	
	public ExecutionResult edit(User user) {
		return provider.editUser(user);
	}

	public ExecutionResult delete(long userId) {
		return provider.deleteUser(userId);
	}
}
