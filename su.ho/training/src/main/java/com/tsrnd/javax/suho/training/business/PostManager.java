package com.tsrnd.javax.suho.training.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tsrnd.javax.suho.training.business.service.PostQueryManager;
import com.tsrnd.javax.suho.training.domain.domain.Post;

@Component
public class PostManager {

    @Autowired
    private PostQueryManager postQueryManager;

    public List<Post> findAll() {
        return postQueryManager.findAll();
    }

    public Post detail(Long id) {
        return postQueryManager.detail(id);
    }
}
