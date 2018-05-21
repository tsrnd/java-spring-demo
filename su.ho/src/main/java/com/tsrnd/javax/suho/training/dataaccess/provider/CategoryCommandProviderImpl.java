package com.tsrnd.javax.suho.training.dataaccess.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tsrnd.javax.suho.training.dataaccess.repository.CategoryCommandRepository;
import com.tsrnd.javax.suho.training.domain.entity.CategoryEntity;

@Component
public class CategoryCommandProviderImpl implements CategoryCommandProvider {

    @Autowired
    private CategoryCommandRepository categoryCommandRepository;

    @Override
    public CategoryEntity save(CategoryEntity category) {
        return categoryCommandRepository.save(category);
    }

    @Override
    public void delete(CategoryEntity category) {
        categoryCommandRepository.delete(category);
    }
}
