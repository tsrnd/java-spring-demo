package vn.dl.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vn.dl.dataaccess.provider.UserCommandProvider;
import vn.dl.domain.ExecutionResult;
import vn.dl.domain.User;

@Component
public class UserCommandManager {
	@Autowired
	UserCommandProvider userCommandProvider;

	public ExecutionResult insert(User user) {
		return userCommandProvider.insert(user.toEntity());
	}
	
	public ExecutionResult update(User user) {
		return userCommandProvider.update(user.toEntity());
	}
	
	public ExecutionResult delete(User user) {
		return userCommandProvider.delete(user.toEntity());
	}
}
