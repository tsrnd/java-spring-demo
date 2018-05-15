package vn.dl.dataaccess.provider;

import java.util.List;
import java.util.Optional;

import vn.dl.domain.User;

public interface UserProvider {
	public List<User> findAll();
    public Optional<User> getUserById(long id);
    public User saveUser(User user);
    public void removeUser(User user);
    public String getUserRank(long id);
    public User findByUsername(String username);
}
