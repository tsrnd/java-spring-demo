package com.tsrnd.javax.suho.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tsrnd.javax.suho.training.business.UserManager;
import com.tsrnd.javax.suho.training.domain.domain.Response;
import com.tsrnd.javax.suho.training.domain.entity.UserEntity;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	@Autowired
	UserManager userManager;

	@PostMapping(produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public ResponseEntity<Response> signIn(@RequestParam(value = "username", required = true) String username,
			@RequestParam(value = "password", required = true) String password) {
		Response response = new Response();
		UserEntity user = userManager.findByUsernameAndPassword(username, password);
		if (user == null) {
			response = new Response(HttpStatus.UNAUTHORIZED, "/auth/");
		} else {
			response.setData(user);
		}
		return ResponseEntity.status(response.getHttpStatus()).body(response);
	}
}
