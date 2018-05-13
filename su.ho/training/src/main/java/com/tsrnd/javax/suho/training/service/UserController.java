package com.tsrnd.javax.suho.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsrnd.javax.suho.training.dataaccess.repository.UserRepository;
import com.tsrnd.javax.suho.training.domain.Response;
import com.tsrnd.javax.suho.training.domain.ResponseError;
import com.tsrnd.javax.suho.training.domain.User;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("")
	public Response get() {
		Response response = new Response();
		List<User> users = userRepository.findAll();
		if (users.isEmpty()) {
			ResponseError error = new ResponseError(HttpStatus.NO_CONTENT);
			response.setError(error);
		} else {
			response.setData(userRepository.findAll());
		}
		return response;
	}
}
