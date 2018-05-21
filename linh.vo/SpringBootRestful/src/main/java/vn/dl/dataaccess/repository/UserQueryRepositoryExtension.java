package vn.dl.dataaccess.repository;

import vn.dl.domain.User;

import java.util.List;

public interface UserQueryRepositoryExtension {
	List<User> getUsers();
}
