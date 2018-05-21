package com.tsrnd.javax.suho.training.dataaccess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tsrnd.javax.suho.training.domain.entity.CategoryEntity;

@Repository
public interface CategoryCommandRepository extends JpaRepository<CategoryEntity, Long> {
}
