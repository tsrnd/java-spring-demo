package com.tsrnd.javax.suho.training.dataaccess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.tsrnd.javax.suho.training.domain.entity.PostCategoryEntity;

@Component
public interface PostCategoryCommandRepository extends JpaRepository<PostCategoryEntity, Long>  {

}
