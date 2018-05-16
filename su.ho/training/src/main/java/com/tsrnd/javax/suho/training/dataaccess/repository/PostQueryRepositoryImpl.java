package com.tsrnd.javax.suho.training.dataaccess.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.tsrnd.javax.suho.training.domain.domain.Category;
import com.tsrnd.javax.suho.training.domain.domain.Comment;
import com.tsrnd.javax.suho.training.domain.domain.Post;
import com.tsrnd.javax.suho.training.domain.domain.User;
import com.tsrnd.javax.suho.training.utils.ArrayUtils;
import com.tsrnd.javax.suho.training.utils.DateUtils;

@SuppressWarnings("unchecked")
@Component
public class PostQueryRepositoryImpl implements PostQueryRepositoryExtension {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Post> getPosts() {
		List<Post> posts = new ArrayList<>();
		String qlString = "SELECT post.id, post.title, post.content, user.id, user.username " + "from PostEntity post "
				+ "INNER JOIN UserEntity user " + "ON post.userId = user.id";
		Query query = entityManager.createQuery(qlString);
		List<Object[]> result = query.getResultList();
		for (Object[] data : result) {
			List<String> row = Arrays.asList(data).stream().map(x -> x.toString()).collect(Collectors.toList());
			User user = new User();
			user.setId(Long.valueOf(row.get(3)));
			user.setUsername(row.get(4));
			Post post = new Post();
			post.setId(Long.valueOf(row.get(0)));
			post.setTitle(row.get(1));
			post.setContent(row.get(2));
			post.setUser(user);
			posts.add(post);
		}
		return posts;
	}

	@Override
	public Post detail(Long id) {
		Post post = new Post();
		String postQueryString = "SELECT post.id, post.title, post.content, user.id, user.username "
				+ "FROM PostEntity post "
				+ "INNER JOIN UserEntity user ON post.userId = user.id "
				+ "WHERE post.id = :id ";
		Query postQuery = entityManager.createQuery(postQueryString);
		postQuery.setParameter("id", id);
		Object[] postResult = (Object[]) postQuery.getSingleResult();
		List<String> postRow =  ArrayUtils.toStringList(postResult);
		post.setId(Long.valueOf(postRow.get(0)));
		post.setTitle(postRow.get(1));
		post.setContent(postRow.get(2));
		User author = new User();
		author.setId(Long.valueOf(postRow.get(3)));
		author.setUsername(postRow.get(4));
		post.setUser(author);
		String categoriesQueryString = "SELECT category.id, category.title "
				+ "FROM CategoryEntity category "
				+ "INNER JOIN PostCategoryEntity postCategory ON category.id = postCategory.categoryId "
				+ "WHERE postCategory.postId = :id";
		Query categoriesQuery = entityManager.createQuery(categoriesQueryString);
		categoriesQuery.setParameter("id", id);
		List<Object[]> categoriesResult = categoriesQuery.getResultList();
		for (Object[] data : categoriesResult) {
			List<String> categoryRow = ArrayUtils.toStringList(data);
			Category category = new Category();
			category.setId(Long.valueOf(categoryRow.get(0)));
			category.setTitle(categoryRow.get(1));
			post.getCategories().add(category);
		}
		String commentsQueryString = "SELECT comment.id, comment.content, comment.createdAt, user.id, user.username "
				+ "FROM CommentEntity comment "
				+ "LEFT JOIN UserEntity user ON comment.userId = user.id "
				+ "WHERE comment.postId = :id";
		Query commentsQuery = entityManager.createQuery(commentsQueryString);
		commentsQuery.setParameter("id", id);
		List<Object[]> commentsResult = commentsQuery.getResultList();
		for (Object[] data : commentsResult) {
			List<String> commentRow = ArrayUtils.toStringList(data);
			Comment comment = new Comment();
			comment.setId(Long.valueOf(commentRow.get(0)));
			comment.setContent(commentRow.get(1));
			comment.setCreateAt(DateUtils.toDateFromString(commentRow.get(2)));
			User user = new User();
			user.setId(Long.valueOf(commentRow.get(3)));
			user.setUsername(commentRow.get(4));
			comment.setUser(user);
			post.getComments().add(comment);
		}
		return post;
	}

}
