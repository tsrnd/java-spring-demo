package vn.dl.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vn.dl.business.service.BookCommandManager;
import vn.dl.business.service.BookQueryManager;

import vn.dl.domain.Book;
import vn.dl.domain.ExecutionResult;

@Component
public class BookManager {
	
	@Autowired
	BookQueryManager bookQueryManager;
	
	@Autowired
	BookCommandManager bookCommandManager;
	
	public List<Book> getAllBook() {
		return bookQueryManager.getAllBook();
	}
	
	public ExecutionResult insert(Book book) {
		return bookCommandManager.insert(book);
	}
}
