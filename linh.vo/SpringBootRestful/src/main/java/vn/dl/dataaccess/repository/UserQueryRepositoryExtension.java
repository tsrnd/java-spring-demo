package vn.dl.dataaccess.repository;

import java.util.List;

import vn.dl.domain.User;

public interface UserQueryRepositoryExtension {
	List<User> getUsers();
}
