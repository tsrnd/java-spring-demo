package com.thinhung.restful.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinhung.restful.model.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
