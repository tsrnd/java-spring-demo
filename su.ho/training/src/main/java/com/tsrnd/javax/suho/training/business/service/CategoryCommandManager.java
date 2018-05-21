package com.tsrnd.javax.suho.training.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tsrnd.javax.suho.training.dataaccess.provider.CategoryCommandProvider;
import com.tsrnd.javax.suho.training.domain.entity.CategoryEntity;

@Component
public class CategoryCommandManager {
    @Autowired
    private CategoryCommandProvider categoryCommandProvider;

    public CategoryEntity save(CategoryEntity category) {
        return categoryCommandProvider.save(category);
    }

    public void delete(CategoryEntity category) {
        categoryCommandProvider.delete(category);
    }
}
