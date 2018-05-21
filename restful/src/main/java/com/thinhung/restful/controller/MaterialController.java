package com.thinhung.restful.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.thinhung.restful.repository.MaterialRepository;

@RestController
public class MaterialController  {
	@Autowired
	MaterialRepository materialRepository;
	
	@ResponseStatus(HttpStatus.OK)
	public Boolean create(@RequestBody @Valid String email) {
		return true;
	}
}
