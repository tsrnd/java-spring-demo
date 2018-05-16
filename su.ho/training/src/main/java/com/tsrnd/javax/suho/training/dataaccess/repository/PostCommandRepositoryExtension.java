package com.tsrnd.javax.suho.training.dataaccess.repository;

import com.tsrnd.javax.suho.training.domain.domain.Post;

public interface PostCommandRepositoryExtension {
    public Post insert();

    public Post update();

    public void delete();
}
