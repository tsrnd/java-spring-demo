package com.tsrnd.javax.suho.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tsrnd.javax.suho.training.business.UserManager;
import com.tsrnd.javax.suho.training.domain.Response;
import com.tsrnd.javax.suho.training.domain.User;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	UserManager userManager;

	@GetMapping
	public ResponseEntity<Response> get() {
		Response response = new Response();
		List<User> users = userManager.findAll();
		response.setData(users);
		return ResponseEntity.status(response.getHttpStatus()).body(response);
	}

	@PostMapping
	public ResponseEntity<Response> create(
			@RequestParam(value = "username", required = true) String username,
			@RequestParam(value = "password", required = true) String password) {
		Response response = new Response();
		User user = new User(username, password);
		User userSaved = userManager.save(user);
		response.setData(userSaved);
		return ResponseEntity.status(response.getHttpStatus()).body(response);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Response> detail(@PathVariable(value = "id") Long id) {
		Response response = new Response();
		User user = userManager.get(id);
		if (user != null) {
			response.setData(user);
		} else {
			response = new Response(HttpStatus.NOT_FOUND, "/users/" + id);
		}
		return ResponseEntity.status(response.getHttpStatus()).body(response);
	}
}
