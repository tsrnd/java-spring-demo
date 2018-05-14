package com.tsrnd.javax.suho.training.dataaccess.provider;

import java.util.List;

import com.tsrnd.javax.suho.training.domain.User;

public interface UserProvider {
	public List<User> findAll();
	
	public User save(User user);
	
	public User findById(Long id);
	
	public User findByUsername(String username);
	
	public User findByUsernameAndPassword(String username, String password);
	
	public void delete(User user);
}
