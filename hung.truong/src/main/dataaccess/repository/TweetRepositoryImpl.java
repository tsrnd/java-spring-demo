package main.dataaccess.repository;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import main.domain.entity.Tweet;
import main.domain.entity.User;

@Component
public class TweetRepositoryImpl implements TweetRepositoryExtension {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Tweet> findByUserId(Long userId) {
		List<Tweet> result = new ArrayList<>();
		String queryString = "SELECT t.id, t.time, t.content, u.userId, u.username, u.fullname, u.address FROM User u, Tweet t WHERE u.userId = t.userId";
		Query query = entityManager.createQuery(queryString);
		@SuppressWarnings("unchecked")
		List<Object[]> rows = query.getResultList();
		for (Object[] row : rows) {
			result.add(new Tweet((Long) row[0], null, (Time) row[1], (String) row[2],
					new User((Long) row[3], (String) row[4], (String) row[5], (String) row[6])));
		}
		return result;
	}
}
