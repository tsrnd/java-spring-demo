package com.tsrnd.javax.suho.training.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tsrnd.javax.suho.training.dataaccess.provider.PostQueryProvider;
import com.tsrnd.javax.suho.training.domain.domain.Post;

@Component
public class PostQueryManager {

    @Autowired
    private PostQueryProvider postQueryProvider;

    public List<Post> findAll() {
        return postQueryProvider.findAll();
    }

    public Post detail(Long id) {
        return postQueryProvider.detail(id);
    }
}
