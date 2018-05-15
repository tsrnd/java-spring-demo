package vn.dl.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vn.dl.dataaccess.provider.BookProvider;
import vn.dl.domain.Book;

@Component
public class BookManager {
	@Autowired
	BookProvider bookProvider;
	
	public List<Book> findAll() {
		return bookProvider.findAll();
	}
	
	public Book saveBook(Book book) {
		return bookProvider.saveBook(book);
	}
}
