package com.tsrnd.javax.suho.training.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tsrnd.javax.suho.training.dataaccess.provider.CategoryQueryProvider;
import com.tsrnd.javax.suho.training.domain.entity.CategoryEntity;

@Component
public class CategoryQueryManager {
	@Autowired
	private CategoryQueryProvider categoryQueryProvider;
	
	public List<CategoryEntity> findAll() {
		return categoryQueryProvider.findAll();
	}
	public CategoryEntity get(Long id) {
		return categoryQueryProvider.get(id);
	}
}
