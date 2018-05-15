package vn.dl.dataaccess.provider;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vn.dl.dataaccess.repository.UserRepository;
import vn.dl.domain.User;

@Component
public class UserProviderImpl implements UserProvider {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public Optional<User> getUserById(long id) {
		return userRepository.findById(id);
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void removeUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getUserRank(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByUsername(String username) {
		// return userRepository.findByUsername(username);
		return userRepository.findByUsername(username);
	}

}
