package com.tsrnd.javax.suho.training.dataaccess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tsrnd.javax.suho.training.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	@Query("select user from User user where user.username = ?1")
	public User user(String username);
	
	@Query("select user from User user where user.username = ?1 and user.password = ?2")
	public User user(String username, String password);
}
