package vn.dl.dataaccess.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.dl.domain.User;

public interface UserQueryRepository extends JpaRepository<User, Long>, UserQueryRepositoryExtension {

}
