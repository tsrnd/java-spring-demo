package com.thinhung.restful.repository.impl;

import javax.persistence.Query;

import com.thinhung.restful.model.domain.Customer;
import com.thinhung.restful.model.entity.CustomerEntity;
import com.thinhung.restful.repository.extensions.CustomerRepositoryExtensions;

public class CustomerRepositoryImpl extends BaseRepositoryImpl implements CustomerRepositoryExtensions {
	@Override
	public Customer getDetail(Long id) {
		String sqlString = "SELECT * FROM Customers WHERE id = :id";
		Query query = this.entityManager.createNativeQuery(sqlString, "CustomerDetail");
		query.setParameter("id", id);
		CustomerEntity customerEntity = (CustomerEntity)query.getSingleResult();
		return customerEntity.toDomain();
	}
}
