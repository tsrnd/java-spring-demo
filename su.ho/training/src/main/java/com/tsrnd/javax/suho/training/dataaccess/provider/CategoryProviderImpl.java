package com.tsrnd.javax.suho.training.dataaccess.provider;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tsrnd.javax.suho.training.dataaccess.repository.CategoryRepository;
import com.tsrnd.javax.suho.training.domain.entity.CategoryEntity;

@Component
public class CategoryProviderImpl implements CategoryProvider {
	
	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public List<CategoryEntity> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public CategoryEntity save(CategoryEntity category) {
		return categoryRepository.save(category);
	}

	@Override
	public CategoryEntity get(Long id) {
		Optional<CategoryEntity> category = categoryRepository.findById(id);
		if (category.isPresent()) {
			return category.get();
		} else {
			return null;
		}
	}

	@Override
	public void delete(CategoryEntity category) {
		categoryRepository.delete(category);
	}

}
