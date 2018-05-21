package vn.dl.dataaccess.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import vn.dl.domain.Book;

@Component
public class BookQueryRepositoryImpl implements BookQueryRepositoryExtension {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Book> getBooks() {
		List<Book> books = new ArrayList<>();
		String sqlString = "SELECT book.id, book.userId, book.author, book.name FROM BookEntity book";
		Query query = em.createQuery(sqlString);
		List<Object[]> result = query.getResultList();
		for (Object[] data : result) {
			List<String> row = Arrays.asList(data).stream().map(x -> x.toString()).collect(Collectors.toList());
			System.out.println(row);
			Book book = new Book();
			book.setId(row.get(0));
			book.setUserId(row.get(1));
			book.setAuthor(row.get(2));
			book.setName(row.get(3));
			books.add(book);
		}
		return books;
	}

}
