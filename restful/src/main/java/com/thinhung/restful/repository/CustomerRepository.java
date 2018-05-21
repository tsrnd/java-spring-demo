package com.thinhung.restful.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinhung.restful.model.entity.CustomerEntity;
import com.thinhung.restful.repository.extensions.CustomerRepositoryExtensions;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long>, CustomerRepositoryExtensions {

}
