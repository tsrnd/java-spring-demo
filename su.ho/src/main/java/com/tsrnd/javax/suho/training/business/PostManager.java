package com.tsrnd.javax.suho.training.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tsrnd.javax.suho.training.business.service.PostCommandManager;
import com.tsrnd.javax.suho.training.business.service.PostQueryManager;
import com.tsrnd.javax.suho.training.domain.domain.Post;
import com.tsrnd.javax.suho.training.domain.domain.PostParams;

@Component
public class PostManager {

    @Autowired
    private PostQueryManager postQueryManager;
    
    @Autowired
    private PostCommandManager postCommandManager;

    public List<Post> findAll() {
        return postQueryManager.findAll();
    }

    public Post detail(Long id) {
        return postQueryManager.detail(id);
    }
    
    public Post insert(PostParams params) {
        Post post = postCommandManager.insert(params);
        return detail(post.getId());
    }

    public Post update(Long id, PostParams params) {
        params.setId(id);
        return postCommandManager.update(params);
    }

    public void delete(Long id) {
        postCommandManager.delete(id);
    }
}
