package main.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;

import main.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
