package com.tsrnd.javax.suho.training.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tsrnd.javax.suho.training.business.service.UserCommandManager;
import com.tsrnd.javax.suho.training.business.service.UserQueryManager;
import com.tsrnd.javax.suho.training.domain.entity.UserEntity;

@Component
public class UserManager {
	@Autowired
	UserCommandManager userCommandManager;
	
	@Autowired
	UserQueryManager userQueryManager;
	
	public List<UserEntity> findAll() {
		return userQueryManager.findAll();
	}
	
	public UserEntity save(UserEntity user) {
		return userCommandManager.save(user);
	}
	
	public UserEntity findById(Long id) {
		return userQueryManager.findById(id);
	}
	
	public UserEntity findByUsername(String username) {
		return userQueryManager.findByUsername(username);
	}
	
	public UserEntity findByUsernameAndPassword(String username, String password) {
		return userQueryManager.findByUsernameAndPassword(username, password);
	}
	
	public void delete(UserEntity user) {
		userCommandManager.delete(user);
	}
}
