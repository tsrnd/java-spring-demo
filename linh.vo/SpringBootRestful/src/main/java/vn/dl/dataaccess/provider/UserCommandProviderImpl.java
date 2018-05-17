package vn.dl.dataaccess.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vn.dl.dataaccess.repository.UserCommandRepository;
import vn.dl.domain.User;

@Component
public class UserCommandProviderImpl implements UserCommandProvider {
	
	@Autowired
	private UserCommandRepository userCommandRepository;

	@Override
	public User saveUser(User user) {
		return null;
	}

}
