package com.tsrnd.javax.suho.training.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tsrnd.javax.suho.training.dataaccess.provider.UserProvider;
import com.tsrnd.javax.suho.training.domain.User;

@Component
public class UserManager {
	@Autowired
	UserProvider userProvider;
	
	public List<User> findAll() {
		return userProvider.findAll();
	}
	
	public User save(User user) {
		return userProvider.save(user);
	}
	
	public User findById(Long id) {
		return userProvider.findById(id);
	}
	
	public User findByUsername(String username) {
		return userProvider.findByUsername(username);
	}
	
	public User findByUsernameAndPassword(String username, String password) {
		return userProvider.findByUsernameAndPassword(username, password);
	}
	
	public void delete(User user) {
		userProvider.delete(user);
	}
}
