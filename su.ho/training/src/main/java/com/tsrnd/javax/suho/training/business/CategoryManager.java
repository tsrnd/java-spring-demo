package com.tsrnd.javax.suho.training.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tsrnd.javax.suho.training.dataaccess.provider.CategoryCommandProvider;
import com.tsrnd.javax.suho.training.dataaccess.provider.CategoryQueryProvider;
import com.tsrnd.javax.suho.training.domain.entity.CategoryEntity;

@Component
public class CategoryManager {
	@Autowired
	private CategoryQueryProvider categoryQueryProvider;
	
	@Autowired
	private CategoryCommandProvider categoryCommandProvider;
	
	public List<CategoryEntity> findAll() {
		return categoryQueryProvider.findAll();
	}
	
	public CategoryEntity save(CategoryEntity category) {
		return categoryCommandProvider.save(category);
	}
	
	public CategoryEntity get(Long id) {
		return categoryQueryProvider.get(id);
	}
	
	public void delete(CategoryEntity category) {
		categoryCommandProvider.delete(category);
	}
}
