package com.tsrnd.javax.suho.training.dataaccess.provider;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tsrnd.javax.suho.training.dataaccess.repository.UserRepository;
import com.tsrnd.javax.suho.training.domain.entity.UserEntity;

@Component
public class UserProviderImpl implements UserProvider {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public List<UserEntity> findAll() {
		return userRepository.findAll();
	}

	@Override
	public UserEntity save(UserEntity user) {
		return userRepository.save(user);
	}

	@Override
	public UserEntity findById(Long id) {
		Optional<UserEntity> user = userRepository.findById(id); 
		if (user.isPresent()) {
			return user.get();
		} else {
			return null;
		}
	}

	@Override
	public UserEntity findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

	@Override
	public UserEntity findByUsernameAndPassword(String username, String password) {
		return userRepository.findByUsernameAndPassword(username, password);
	}

	@Override
	public void delete(UserEntity user) {
		userRepository.delete(user);
	}

}
