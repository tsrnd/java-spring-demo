package vn.dl.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vn.dl.dataaccess.provider.UserProvider;
import vn.dl.domain.User;

@Component
public class UserManager {
	@Autowired
	UserProvider userProvider;
	
	public List<User> findAll() {
		return userProvider.findAll();
	}
	
	public User saveUser(User user) {
		return userProvider.saveUser(user);
	}
	
	public User findByUsername(String username) {
		return userProvider.findByUsername(username);
	}
	
	public Optional<User> getUserById(long id) {
		return userProvider.getUserById(id);
	}

}
