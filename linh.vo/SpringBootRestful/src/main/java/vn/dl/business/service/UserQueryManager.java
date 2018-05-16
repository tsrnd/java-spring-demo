package vn.dl.business.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vn.dl.dataaccess.provider.UserQueryProvider;
import vn.dl.domain.User;

@Component
public class UserQueryManager {
	@Autowired
	private UserQueryProvider userQueryProvider;
	
	public List<User> getAllUser() {
		List<User> users = userQueryProvider.findAll();
		return users;
	}
	
	public Optional<User> getUserById(long id) {
		Optional<User> user = userQueryProvider.getUserById(id);
		return user;
	}
	
	public User findByUsername(String username) {
		User user = userQueryProvider.getUsername(username);
		return user;
	}
}
