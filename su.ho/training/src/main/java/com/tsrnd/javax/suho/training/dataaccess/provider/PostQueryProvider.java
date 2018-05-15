package com.tsrnd.javax.suho.training.dataaccess.provider;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tsrnd.javax.suho.training.domain.domain.Post;

@Component
public interface PostQueryProvider {
	public List<Post> findAll();
}
