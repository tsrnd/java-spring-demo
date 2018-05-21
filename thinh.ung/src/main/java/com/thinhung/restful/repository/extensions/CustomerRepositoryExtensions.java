package com.thinhung.restful.repository.extensions;

import com.thinhung.restful.model.domain.Customer;

public interface CustomerRepositoryExtensions {
	public Customer getDetail(Long id);
}
