package com.tsrnd.javax.suho.training.dataaccess.provider;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tsrnd.javax.suho.training.dataaccess.repository.CategoryQueryRepository;
import com.tsrnd.javax.suho.training.domain.entity.CategoryEntity;

@Component
public class CategoryQueryProviderImpl implements CategoryQueryProvider {
	
	@Autowired
	private CategoryQueryRepository categoryQueryRepository;

	@Override
	public List<CategoryEntity> findAll() {
		return categoryQueryRepository.findAll();
	}

	@Override
	public CategoryEntity get(Long id) {
		Optional<CategoryEntity> category = categoryQueryRepository.findById(id);
		if (category.isPresent()) {
			return category.get();
		} else {
			return null;
		}
	}
}
