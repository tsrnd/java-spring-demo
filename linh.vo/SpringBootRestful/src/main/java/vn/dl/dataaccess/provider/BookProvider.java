package vn.dl.dataaccess.provider;

import java.util.List;

import vn.dl.domain.Book;

public interface BookProvider {
	public List<Book> findAll();
	public int countByUserId(long id);
	public Book saveBook(Book book);
}
