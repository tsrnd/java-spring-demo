package com.tsrnd.javax.suho.training.dataaccess.provider;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tsrnd.javax.suho.training.dataaccess.repository.CategoryRepository;
import com.tsrnd.javax.suho.training.domain.Category;

@Component
public class CategoryProviderImpl implements CategoryProvider {
	
	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public Category save(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public Category get(Long id) {
		Optional<Category> category = categoryRepository.findById(id);
		if (category.isPresent()) {
			return category.get();
		} else {
			return null;
		}
	}

	@Override
	public void delete(Category category) {
		categoryRepository.delete(category);
	}

}
