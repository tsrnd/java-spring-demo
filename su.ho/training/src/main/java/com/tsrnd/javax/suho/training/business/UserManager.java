package com.tsrnd.javax.suho.training.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tsrnd.javax.suho.training.dataaccess.provider.UserProvider;
import com.tsrnd.javax.suho.training.domain.entity.UserEntity;

@Component
public class UserManager {
	@Autowired
	UserProvider userProvider;
	
	public List<UserEntity> findAll() {
		return userProvider.findAll();
	}
	
	public UserEntity save(UserEntity user) {
		return userProvider.save(user);
	}
	
	public UserEntity findById(Long id) {
		return userProvider.findById(id);
	}
	
	public UserEntity findByUsername(String username) {
		return userProvider.findByUsername(username);
	}
	
	public UserEntity findByUsernameAndPassword(String username, String password) {
		return userProvider.findByUsernameAndPassword(username, password);
	}
	
	public void delete(UserEntity user) {
		userProvider.delete(user);
	}
}
