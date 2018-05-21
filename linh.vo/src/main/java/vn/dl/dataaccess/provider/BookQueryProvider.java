package vn.dl.dataaccess.provider;

import java.util.List;

import vn.dl.domain.Book;

public interface BookQueryProvider {
	public List<Book> findAll();
}
