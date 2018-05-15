package com.tsrnd.javax.suho.training.dataaccess.provider;

import java.util.List;

import com.tsrnd.javax.suho.training.domain.entity.CategoryEntity;

public interface CategoryProvider {
	public List<CategoryEntity> findAll();

	public CategoryEntity save(CategoryEntity category);

	public CategoryEntity get(Long id);

	public void delete(CategoryEntity category);
}
