package vn.dl.dataaccess.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.dl.domain.entity.UserEntity;

public interface UserCommandRepository extends JpaRepository<UserEntity, Long> {

}
