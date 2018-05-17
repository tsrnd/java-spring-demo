package vn.dl.dataaccess.provider;

import java.util.List;
import java.util.Optional;

import vn.dl.domain.User;
import vn.dl.domain.entity.UserEntity;

public interface UserQueryProvider {
	public List<User> findAll();
	public Optional<User> getUserById(long id);
	public String getUserRank(long id);
	public UserEntity findByUsername(String username);
}
