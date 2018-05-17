package com.thinhung.restful.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinhung.restful.model.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
