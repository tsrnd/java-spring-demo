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
import com.thinhung.restful.repository.CustomerRepository;
import com.thinhung.restful.repository.impl.CustomerRepositoryImpl;

@RestController
@RequestMapping(path = "/customers")
public class CustomerController  {
	@Autowired
	CustomerRepository customerRepository;
	
	/**
	 * Get Customer detail
	 *
	 * @author  Thinh Ung
	 * @see     CustomerRepositoryImpl.java
	 */
	@GetMapping(path = "/{id}")
	@ResponseBody
	public Object getDetail(@PathVariable(name = "id") Long id) {
		Meta meta = new Meta(HttpStatus.OK, "");
		Object result = customerRepository.getDetail(id);
		Response response = new Response(meta, result); 
		return response;
	}
}
