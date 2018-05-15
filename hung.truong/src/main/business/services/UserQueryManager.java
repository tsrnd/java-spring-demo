package main.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import main.dataaccess.provider.UserQueryProvider;
import main.domain.User;

@Component
public class UserQueryManager {

	@Autowired
	UserQueryProvider provider;
	
	public List<User> getAllUser() {
		return provider.getAllUser();
	}
	
	public User getUserById(long id) {
		return provider.getUserById(id);
	}

	public Object getUserByUsername(String name) {
		return provider.getUserByUsername(name);
	}
}
