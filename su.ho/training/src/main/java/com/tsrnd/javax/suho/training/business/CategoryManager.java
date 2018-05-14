package com.tsrnd.javax.suho.training.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tsrnd.javax.suho.training.dataaccess.provider.CategoryProvider;
import com.tsrnd.javax.suho.training.domain.Category;

@Component
public class CategoryManager {
	@Autowired
	CategoryProvider categoryProvider;
	
	public List<Category> findAll() {
		return categoryProvider.findAll();
	}
	
	public Category save(Category category) {
		return categoryProvider.save(category);
	}
	
	public Category get(Long id) {
		return categoryProvider.get(id);
	}
	
	public void delete(Category category) {
		categoryProvider.delete(category);
	}
}
