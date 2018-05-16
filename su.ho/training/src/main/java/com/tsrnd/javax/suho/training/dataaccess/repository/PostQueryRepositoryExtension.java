package com.tsrnd.javax.suho.training.dataaccess.repository;

import java.util.List;

import com.tsrnd.javax.suho.training.domain.domain.Post;

public interface PostQueryRepositoryExtension {
    public List<Post> getPosts();

    public Post detail(Long id);
}
