package com.thinhung.restful.repository.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseRepositoryImpl {
	@Autowired
	protected EntityManager entityManager;
}
