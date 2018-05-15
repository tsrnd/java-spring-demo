package com.tsrnd.javax.suho.training.dataaccess.provider;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tsrnd.javax.suho.training.dataaccess.repository.PostQueryRepository;
import com.tsrnd.javax.suho.training.domain.domain.Post;

@Component
public class PostQueryProviderImpl implements PostQueryProvider {

	@Autowired
	PostQueryRepository postQueryRepository;

	@Override
	public List<Post> findAll() {
		return postQueryRepository.getPosts();
	}
}
