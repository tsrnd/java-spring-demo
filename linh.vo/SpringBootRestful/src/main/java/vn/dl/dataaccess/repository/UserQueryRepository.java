package vn.dl.dataaccess.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.dl.domain.entity.UserEntity;

public interface UserQueryRepository extends JpaRepository<UserEntity, Long>, UserQueryRepositoryExtension {

}
