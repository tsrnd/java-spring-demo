package main.dataaccess.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import main.domain.entity.Post;
import main.domain.entity.User;

@Component
public class PostRepositoryImpl implements PostRepositoryExtension {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Post> getUserPosts(long userId) {
		List<Post> result = new ArrayList<>();
		String queryString = "SELECT p.id, p.title, p.summary, p.content, p.image, u.userId, u.username, u.fullname, u.address FROM Post p, User u WHERE p.userId = u.userId AND p.userId = u.userId";
		Query query = entityManager.createQuery(queryString);
		List<Object[]> rows = query.getResultList();
		for (Object[] row : rows) {
			result.add(new Post((Long)row[0], (String)row[1], (String)row[2], (String)row[3], (String)row[4], null, new User((Long)row[5], (String)row[6], (String)row[7], (String)row[8])));
		}
		return result;
	}
}
