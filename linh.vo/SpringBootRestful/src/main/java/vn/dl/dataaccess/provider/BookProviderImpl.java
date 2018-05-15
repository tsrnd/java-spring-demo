package vn.dl.dataaccess.provider;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vn.dl.dataaccess.repository.BookRepository;
import vn.dl.domain.Book;

@Component
public class BookProviderImpl implements BookProvider {

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public int countByUserId(long id) {
		return bookRepository.countByUserId(id);
	}

	@Override
	public List<Book> findAll() {
		return bookRepository.findAll();
	}

	@Override
	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}
	
}
