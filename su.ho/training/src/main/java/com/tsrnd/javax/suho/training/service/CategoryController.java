package com.tsrnd.javax.suho.training.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tsrnd.javax.suho.training.business.CategoryManager;
import com.tsrnd.javax.suho.training.domain.domain.Response;
import com.tsrnd.javax.suho.training.domain.entity.CategoryEntity;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    @Autowired
    private CategoryManager categoryManager;

    @GetMapping
    public ResponseEntity<Response> get() {
        Response response = new Response();
        List<CategoryEntity> categories = categoryManager.findAll();
        response.setData(categories);
        return ResponseEntity.status(response.getHttpStatus()).body(response);
    }

    @PostMapping
    public ResponseEntity<Response> create(@RequestParam(value = "title", required = true) String title) {
        Response response = new Response();
        CategoryEntity category = new CategoryEntity(title);
        category = categoryManager.save(category);
        response.setData(category);
        return ResponseEntity.status(response.getHttpStatus()).body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Response> detail(@PathVariable(value = "id") Long id) {
        Response response = new Response();
        CategoryEntity category = categoryManager.get(id);
        if (category != null) {
            response.setData(category);
        } else {
            response = new Response(HttpStatus.NOT_FOUND, "/users/" + id);
        }
        return ResponseEntity.status(response.getHttpStatus()).body(response);
    }

    @PutMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<Response> update(@PathVariable(value = "id") Long id,
            @RequestBody HashMap<String, Object> json) {
        Response response = new Response();
        String title = (String) json.get("title");
        CategoryEntity category = categoryManager.get(id);
        if (category != null) {
            if (title != null) {
                category.setTitle(title);
                categoryManager.save(category);
            }
            response.setData(category);
        } else {
            response = new Response(HttpStatus.NOT_FOUND, "/categories/" + id);
        }
        return ResponseEntity.status(response.getHttpStatus()).body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Response> delete(@PathVariable(value = "id") Long id) {
        Response response = new Response();
        CategoryEntity category = categoryManager.get(id);
        if (category != null) {
            categoryManager.delete(category);
            response.setData(category);
        } else {
            response = new Response(HttpStatus.NOT_FOUND, "/categories/" + id);
        }
        return ResponseEntity.status(response.getHttpStatus()).body(response);
    }
}
