package com.tsrnd.javax.suho.training.dataaccess.provider;

import java.util.List;

import com.tsrnd.javax.suho.training.domain.Category;

public interface CategoryProvider {
	public List<Category> findAll();

	public Category save(Category category);

	public Category get(Long id);

	public void delete(Category category);
}
