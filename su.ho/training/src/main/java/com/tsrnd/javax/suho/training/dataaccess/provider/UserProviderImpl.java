package com.tsrnd.javax.suho.training.dataaccess.provider;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tsrnd.javax.suho.training.dataaccess.repository.UserRepository;
import com.tsrnd.javax.suho.training.domain.User;

@Component
public class UserProviderImpl implements UserProvider {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public User get(Long id) {
		Optional<User> user = userRepository.findById(id); 
		if (user.isPresent()) {
			return user.get();
		} else {
			return null;
		}
	}

	@Override
	public User get(String username) {
		return userRepository.user(username);
	}

	@Override
	public User get(String username, String password) {
		return userRepository.user(username, password);
	}

	@Override
	public void delete(User user) {
		userRepository.delete(user);
	}

}
