package vn.dl.dataaccess.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import vn.dl.domain.User;

@Component
public class UserQueryRepositoryImpl implements UserQueryRepositoryExtension {
	
	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUsers() {
		List<User> users = new ArrayList<>();
		String sqlString = "SELECT user.id, user.username, user.address FROM UserEntity user";
		Query query = em.createQuery(sqlString);
		List<Object[]> result = query.getResultList();
		for (Object[] data : result) {
			List<String> row = Arrays.asList(data).stream().map(x -> x.toString()).collect(Collectors.toList());
			System.out.println(row);
			User user = new User();
			user.setId(row.get(0));
			user.setUsername(row.get(1));
			user.setAddress(row.get(2));
			users.add(user);
		}
		return users;
	}
}
