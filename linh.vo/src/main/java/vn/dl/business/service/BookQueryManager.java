package vn.dl.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vn.dl.dataaccess.provider.BookQueryProvider;
import vn.dl.domain.Book;

@Component
public class BookQueryManager {

	@Autowired
	private BookQueryProvider bookQueryProvider;
	
	public List<Book> getAllBook() {
		List<Book> books = bookQueryProvider.findAll();
		return books;
	}
}
