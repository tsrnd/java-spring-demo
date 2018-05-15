package main.dataaccess.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import main.domain.User;

@Component
public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryExtension {
	@Query("SELECT u FROM User u WHERE u.username = ?1")
	public List<User> getUserByUsername(String username);

	public List<User> findByFullname(String fullname);
}
