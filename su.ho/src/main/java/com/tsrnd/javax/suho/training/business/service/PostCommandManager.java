package com.tsrnd.javax.suho.training.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tsrnd.javax.suho.training.dataaccess.provider.PostCommandProvider;
import com.tsrnd.javax.suho.training.domain.domain.Post;
import com.tsrnd.javax.suho.training.domain.domain.PostParams;

@Component
public class PostCommandManager {

    @Autowired
    PostCommandProvider provider;
    
    public Post insert(PostParams params) {
        return provider.insert(params);
    }

    public Post update(PostParams params) {
        return provider.update(params);
    }

    public void delete(Long id) {
        provider.delete(id);
    }
}
