package com.tsrnd.javax.suho.training.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tsrnd.javax.suho.training.dataaccess.provider.CategoryProvider;
import com.tsrnd.javax.suho.training.domain.entity.CategoryEntity;

@Component
public class CategoryManager {
	@Autowired
	CategoryProvider categoryProvider;
	
	public List<CategoryEntity> findAll() {
		return categoryProvider.findAll();
	}
	
	public CategoryEntity save(CategoryEntity category) {
		return categoryProvider.save(category);
	}
	
	public CategoryEntity get(Long id) {
		return categoryProvider.get(id);
	}
	
	public void delete(CategoryEntity category) {
		categoryProvider.delete(category);
	}
}
