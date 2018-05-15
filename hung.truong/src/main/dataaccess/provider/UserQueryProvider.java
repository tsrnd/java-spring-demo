package main.dataaccess.provider;

import java.util.List;

import main.domain.User;

public interface UserQueryProvider {
	
	public User getUserByUsername(String username);
	
	public List<User> getUsersByFullname(String fullname);
	
	public User getUserById(long id);
	
	public List<User> getAllUser();
}
