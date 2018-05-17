package vn.dl.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vn.dl.dataaccess.provider.UserCommandProvider;
import vn.dl.domain.User;
import vn.dl.domain.entity.UserEntity;

@Component
public class UserCommandManager {
	@Autowired
	private UserCommandProvider userCommandProvider;

	public User saveUser(User user) {
		// TODO:
		UserEntity userEntity = user.toEntity();
		return null;
	}
}
