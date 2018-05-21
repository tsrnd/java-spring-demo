package vn.dl.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vn.dl.business.service.UserCommandManager;
import vn.dl.business.service.UserQueryManager;
import vn.dl.domain.ExecutionResult;
import vn.dl.domain.User;

@Component
public class UserManager {
	@Autowired
	UserQueryManager userQueryManager;
	
	@Autowired
	UserCommandManager userCommandManager;
	
	public List<User> getAllUser() {
		return userQueryManager.getAllUser();
	}
	
	public ExecutionResult insert(User user) {
		return userCommandManager.insert(user);
	}
}
