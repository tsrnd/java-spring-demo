package vn.dl.dataaccess.provider;

import java.util.List;
import java.util.Optional;

import vn.dl.domain.User;

public interface UserQueryProvider {
	public List<User> findAll();
	public Optional<User> getUserById(long id);
	public String getUserRank(long id);
	public User getUsername(String username);
}
