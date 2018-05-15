package com.tsrnd.javax.suho.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsrnd.javax.suho.training.business.PostManager;
import com.tsrnd.javax.suho.training.domain.domain.Post;
import com.tsrnd.javax.suho.training.domain.domain.Response;

@RestController
@RequestMapping("/api/posts")
public class PostController {
	
	@Autowired
	PostManager manager;
	
	@GetMapping
	public ResponseEntity<Response> get() {
		Response response = new Response();
		List<Post> posts = manager.findAll();
		response.setData(posts);
		return ResponseEntity.status(response.getHttpStatus()).body(response);
	}

}
