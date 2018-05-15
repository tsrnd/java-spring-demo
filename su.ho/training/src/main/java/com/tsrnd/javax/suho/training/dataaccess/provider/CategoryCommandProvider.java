package com.tsrnd.javax.suho.training.dataaccess.provider;

import com.tsrnd.javax.suho.training.domain.entity.CategoryEntity;

public interface CategoryCommandProvider {
	public CategoryEntity save(CategoryEntity category);
	public void delete(CategoryEntity category);
}
