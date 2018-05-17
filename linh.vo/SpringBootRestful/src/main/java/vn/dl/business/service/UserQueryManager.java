package vn.dl.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vn.dl.dataaccess.provider.UserQueryProvider;
import vn.dl.domain.User;
import vn.dl.domain.entity.UserEntity;

@Component
public class UserQueryManager {
	@Autowired
	private UserQueryProvider userQueryProvider;
	
	public List<User> getAllUser() {
		List<User> users = userQueryProvider.findAll();
		return users;
	}
	
	public User findByUsername(String username) {
		UserEntity userEntity = userQueryProvider.findByUsername(username);
		return userEntity == null ? null : userEntity.toDomain();
	}
}
