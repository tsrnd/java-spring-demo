package com.tsrnd.javax.suho.training.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tsrnd.javax.suho.training.dataaccess.repository.UserRepository;
import com.tsrnd.javax.suho.training.domain.User;

@Component
public class UserManager {
	@Autowired
	UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User save(User user) {
		return userRepository.save(user);
	}
	
	public User get(Long id) {
		Optional<User> user = userRepository.findById(id); 
		if (user.isPresent()) {
			return user.get();
		} else {
			return null;
		}
	}
}
