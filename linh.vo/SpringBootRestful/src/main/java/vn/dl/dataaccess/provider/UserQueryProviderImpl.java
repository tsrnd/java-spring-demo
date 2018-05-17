package vn.dl.dataaccess.provider;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vn.dl.dataaccess.repository.UserQueryRepository;
import vn.dl.domain.User;

@Component
public class UserQueryProviderImpl implements UserQueryProvider {
	
	@Autowired
	private UserQueryRepository userQueryRepository;
	
	@Override
	public List<User> findAll() {
		List<User> users = userQueryRepository.getUsers();
		return users;
	}
}
