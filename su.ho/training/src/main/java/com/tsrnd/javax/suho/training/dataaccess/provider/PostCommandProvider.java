package com.tsrnd.javax.suho.training.dataaccess.provider;

import com.tsrnd.javax.suho.training.domain.domain.Post;
import com.tsrnd.javax.suho.training.domain.domain.PostParams;

public interface PostCommandProvider {
    public Post insert(PostParams params);

    public Post update(PostParams params);

    public void delete(Long id);
}
