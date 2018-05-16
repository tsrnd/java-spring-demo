package vn.dl.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vn.dl.business.service.UserCommandManager;
import vn.dl.business.service.UserQueryManager;
import vn.dl.dataaccess.provider.UserCommandProvider;
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

	public Optional<User> getUserById(long id) {
		return userQueryManager.getUserById(id);
	}
	
//	public User saveUser(User user) {
//		return userCommandManager.saveUser(user);
//	}
}
