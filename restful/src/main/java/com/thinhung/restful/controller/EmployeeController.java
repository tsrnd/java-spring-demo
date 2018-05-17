package com.thinhung.restful.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.thinhung.restful.repository.EmployeeRepository;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController   {
	@Autowired
	EmployeeRepository employeeResository;
	@GetMapping(path = "statistic/{id}")
	@ResponseBody
	/**
	 * Get all invoices within customer of an employee in a time period
	 *
	 * @author  Thinh Ung
	 * @see     EmployeeRepositoryImpl.java
	 */
	public Object getCustomers(@PathVariable("id") Long employeeId) {
		return employeeResository.getCustomers(employeeId);
	}
}
