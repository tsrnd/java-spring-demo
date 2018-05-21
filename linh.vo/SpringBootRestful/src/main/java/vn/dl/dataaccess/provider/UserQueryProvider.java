package vn.dl.dataaccess.provider;

import java.util.List;

import vn.dl.domain.User;

public interface UserQueryProvider {
	public List<User> findAll();
}
