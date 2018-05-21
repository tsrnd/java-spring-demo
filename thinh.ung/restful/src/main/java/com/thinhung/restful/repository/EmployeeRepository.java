package com.thinhung.restful.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.thinhung.restful.model.entity.EmployeeEntity;
import com.thinhung.restful.repository.extensions.EmployeeRepositoryExtensions;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long>, EmployeeRepositoryExtensions{

}
