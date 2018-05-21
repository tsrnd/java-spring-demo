package com.tsrnd.javax.suho.training.dataaccess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.tsrnd.javax.suho.training.domain.entity.PostEntity;

@Component
public interface PostQueryRepository extends JpaRepository<PostEntity, Long>, PostQueryRepositoryExtension {
}
