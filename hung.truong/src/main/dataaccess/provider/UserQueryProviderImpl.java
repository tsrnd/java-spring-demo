package main.dataaccess.provider;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import main.dataaccess.repository.UserRepository;
import main.domain.entity.User;

@Component
public class UserQueryProviderImpl implements UserQueryProvider {

	@Autowired
	private UserRepository repository;

	@Override
	public User getUserByUsername(String username) {
		List<User> users = repository.getUserByUsername(username);
		return users.isEmpty() ? null : repository.getUserByUsername(username).get(0);
	}

	@Override
	public List<User> getUsersByFullname(String fullname) {
		return repository.findByFullname(fullname);
	}

	@Override
	public User getUserById(long id) {
		return repository.findOne(id);
	}

	@Override
	public List<User> getAllUser() {
		return repository.findAll();
	}
}
