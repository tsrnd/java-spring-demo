package vn.asiantech.sbrestful.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.asiantech.sbrestful.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
