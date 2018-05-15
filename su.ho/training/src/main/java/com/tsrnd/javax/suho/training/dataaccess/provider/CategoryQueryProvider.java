package com.tsrnd.javax.suho.training.dataaccess.provider;

import java.util.List;

import com.tsrnd.javax.suho.training.domain.entity.CategoryEntity;

public interface CategoryQueryProvider {
	public List<CategoryEntity> findAll();
	public CategoryEntity get(Long id);
}
