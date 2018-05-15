package com.tsrnd.javax.suho.training.dataaccess.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.tsrnd.javax.suho.training.domain.domain.Post;
import com.tsrnd.javax.suho.training.domain.domain.User;

@Component
public class PostQueryRepositoryImpl implements PostQueryRepositoryExtension {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Post> getPosts() {
		List<Post> posts = new ArrayList<>();
		String qlString = "SELECT post.id, post.title, post.content, user.id, user.username " + "from PostEntity post "
				+ "INNER JOIN UserEntity user " + "ON post.userId = user.id";
		Query query = entityManager.createQuery(qlString);
		List<Object[]> result = query.getResultList();
		for (Object[] data : result) {
			List<String> rows = Arrays.asList(data).stream().map(x -> x.toString()).collect(Collectors.toList());
			User user = new User();
			user.setId(Long.valueOf(rows.get(3)));
			user.setUsername(rows.get(4));
			Post post = new Post();
			post.setId(Long.valueOf(rows.get(0)));
			post.setTitle(rows.get(1));
			post.setContent(rows.get(2));
			post.setUser(user);
			posts.add(post);
		}
		return posts;
	}

}
