package com.tsrnd.javax.suho.training.dataaccess.provider;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tsrnd.javax.suho.training.dataaccess.repository.UserQueryRepository;
import com.tsrnd.javax.suho.training.domain.entity.UserEntity;

@Component
public class UserQueryProviderImpl implements UserQueryProvider {
	
	@Autowired
	private UserQueryRepository userQueryRepository;

	@Override
	public List<UserEntity> findAll() {
		return userQueryRepository.findAll();
	}

	@Override
	public UserEntity findById(Long id) {
		Optional<UserEntity> user = userQueryRepository.findById(id); 
		if (user.isPresent()) {
			return user.get();
		} else {
			return null;
		}
	}

	@Override
	public UserEntity findByUsername(String username) {
		return userQueryRepository.findByUsername(username);
	}

	@Override
	public UserEntity findByUsernameAndPassword(String username, String password) {
		return userQueryRepository.findByUsernameAndPassword(username, password);
	}
}
