package com.tsrnd.javax.suho.training.dataaccess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tsrnd.javax.suho.training.domain.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
	public UserEntity findByUsername(String username);
	public UserEntity findByUsernameAndPassword(String username, String password);
}
