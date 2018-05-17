package com.thinhung.restful.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.thinhung.restful.common.Data;
import com.thinhung.restful.common.Meta;
import com.thinhung.restful.common.Response;
import com.thinhung.restful.model.domain.User;
import com.thinhung.restful.repository.UserRepository;

@RestController
@RequestMapping(path = "/users")
public class UserController  {
	@Autowired 
	private UserRepository userRepository;
	@PostMapping(path = "/add")
	public ResponseEntity<Response<String>> add(@RequestParam String name, @RequestParam String email) {
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		userRepository.save(user);
		
		Meta meta = new Meta(HttpStatus.OK, "");
		Data<String> data = new Data<>();
		data.setValue("Added user");
		Response<String> response = new Response<>(meta, data);
		return ResponseEntity.ok(response);
	}
	
	@GetMapping(path = "/all")
	public @ResponseBody List<User> all() {
		List<User> users = userRepository.findAll();
		return users;
	}
}
