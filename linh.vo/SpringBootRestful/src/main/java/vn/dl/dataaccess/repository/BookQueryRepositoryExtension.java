package vn.dl.dataaccess.repository;

import java.util.List;

import vn.dl.domain.Book;

public interface BookQueryRepositoryExtension {
	List<Book> getBooks();
}
