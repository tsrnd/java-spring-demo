package com.thinhung.restful.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.thinhung.restful.common.Meta;
import com.thinhung.restful.common.Response;
import com.thinhung.restful.repository.EmployeeRepository;
import com.thinhung.restful.repository.impl.EmployeeRepositoryImpl;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController   {
	@Autowired
	EmployeeRepository employeeResository;
	
	/**
	 * Get all invoices within customer of an employee in a time period
	 *
	 * @author  Thinh Ung
	 * @see     EmployeeRepositoryImpl.java
	 */
	@GetMapping(path = "statistic/{id}")
	@ResponseBody
	public Object getCustomers(@PathVariable("id") Long employeeId) {
		Meta meta = new Meta(HttpStatus.OK, "");
		Object result = employeeResository.getCustomers(employeeId);
		Response response = new Response(meta, result); 
		return response;
	}
}
