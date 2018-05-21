package vn.dl.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vn.dl.dataaccess.provider.BookCommandProvider;
import vn.dl.domain.Book;
import vn.dl.domain.ExecutionResult;

@Component
public class BookCommandManager {
	
	@Autowired
	BookCommandProvider bookCommandProvider;
	
	public ExecutionResult insert(Book book) {
		return bookCommandProvider.insert(book.toEntity());
	}
	
	public ExecutionResult update(Book book) {
		return bookCommandProvider.update(book.toEntity());
	}
	
	public ExecutionResult delete(Book book) {
		return bookCommandProvider.delete(book.toEntity());
	}
}
