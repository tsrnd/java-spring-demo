package com.tsrnd.javax.suho.training.service;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsrnd.javax.suho.training.business.PostManager;
import com.tsrnd.javax.suho.training.domain.domain.Post;
import com.tsrnd.javax.suho.training.domain.domain.PostParams;
import com.tsrnd.javax.suho.training.domain.domain.Response;
import com.tsrnd.javax.suho.training.service.validator.PostValidator;
import com.tsrnd.javax.suho.training.utils.ErrorUtils;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private PostManager manager;

    @Autowired
    private PostValidator validator;

    @GetMapping
    public ResponseEntity<Response> get() {
        Response response = new Response();
        List<Post> posts = manager.findAll();
        response.setData(posts);
        return ResponseEntity.status(response.getHttpStatus()).body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Response> detail(@PathVariable(name = "id") Long id) {
        Response response = new Response();
        Post post = manager.detail(id);
        response.setData(post);
        return ResponseEntity.status(response.getHttpStatus()).body(response);
    }

    @PostMapping(value = "", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
    public ResponseEntity<Response> create(@Valid @NotNull @RequestBody PostParams params, Errors error) {
        Response response = new Response();
        validator.validate(params, error);
        if (error.hasErrors()) {
            response = new Response(HttpStatus.BAD_REQUEST, "POST /posts/");
            response.setError(ErrorUtils.toMessages(error));
        } else {
            Post post = manager.insert(params);
            response.setData(post);
        }
        return ResponseEntity.status(response.getHttpStatus()).body(response);
    }
}
