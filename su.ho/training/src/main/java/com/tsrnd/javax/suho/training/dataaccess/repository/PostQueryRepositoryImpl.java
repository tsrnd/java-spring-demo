package com.tsrnd.javax.suho.training.dataaccess.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.tsrnd.javax.suho.training.domain.domain.Post;

@Component
public class PostQueryRepositoryImpl implements PostQueryRepositoryExtension {
	
	@PersistenceContext
    private EntityManager entityManager;

	@Override
	public List<Post> getPosts() {
		List<Post> posts = null;
		String qlString = "SELECT post.id, post.title, post.content, user.id, user.username "
				+ "from PostEntity post "
				+ "inner join UserEntity user "
				+ "on post.userId = user.id";
		Query query = entityManager.createQuery(qlString);
		System.out.println(query.getResultList());
		return posts;
	}

}
