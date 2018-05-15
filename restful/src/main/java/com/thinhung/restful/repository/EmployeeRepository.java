package com.thinhung.restful.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.thinhung.restful.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
