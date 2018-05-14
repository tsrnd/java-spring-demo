package com.tsrnd.javax.suho.training.dataaccess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tsrnd.javax.suho.training.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	public User findByUsername(String username);
	public User findByUsernameAndPassword(String username, String password);
}
