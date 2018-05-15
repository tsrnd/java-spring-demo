package com.tsrnd.javax.suho.training.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tsrnd.javax.suho.training.dataaccess.provider.UserCommandProvider;
import com.tsrnd.javax.suho.training.domain.entity.UserEntity;

@Component
public class UserCommandManager {
	@Autowired
	private UserCommandProvider userCommandProvider;
	
	public UserEntity save(UserEntity user) {
		return userCommandProvider.save(user);
	}
	
	public void delete(UserEntity user) {
		userCommandProvider.delete(user);
	}
}
