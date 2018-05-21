package vn.dl.dataaccess.provider;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vn.dl.dataaccess.repository.BookQueryRepository;
import vn.dl.domain.Book;

@Component
public class BookQueryProviderImpl implements BookQueryProvider {

	@Autowired
	private BookQueryRepository bookQueryRepository;
	
	@Override
	public List<Book> findAll() {
		List<Book> books = bookQueryRepository.getBooks();
		return books;
	}
}
