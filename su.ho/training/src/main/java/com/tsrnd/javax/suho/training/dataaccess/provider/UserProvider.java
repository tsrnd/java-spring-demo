package com.tsrnd.javax.suho.training.dataaccess.provider;

import java.util.List;

import com.tsrnd.javax.suho.training.domain.entity.UserEntity;

public interface UserProvider {
	public List<UserEntity> findAll();
	
	public UserEntity save(UserEntity user);
	
	public UserEntity findById(Long id);
	
	public UserEntity findByUsername(String username);
	
	public UserEntity findByUsernameAndPassword(String username, String password);
	
	public void delete(UserEntity user);
}
