package vn.dl.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.dl.business.BookManager;
import vn.dl.domain.Book;
import vn.dl.domain.ExecutionResult;
import vn.dl.domain.Response;

@RestController
@RequestMapping("v1/books")
public class BookController {
	private static final Logger LOGGER = LoggerFactory.getLogger(BookController.class);
	
	@Autowired
	BookManager bookManager;
	
	@GetMapping
	public ResponseEntity<Response> findAll() {
		Response res = new Response();
		List<Book> books = bookManager.getAllBook();
		res.setData(books);
		return ResponseEntity.ok(res);
	}
	
	@PostMapping(value = "/add")
	public Object createBook(@RequestBody Book book) {
		Response res = new Response();
		try {
			ExecutionResult result = new ExecutionResult();
			result = bookManager.insert(book);
			if (result.getResult() == ExecutionResult.Status.Success) {
				res.setSuccess(true);
			}
		} catch (Exception ex) {
			res.setSuccess(false);
			res.setError(ex);
			res.setMessage(ex.getMessage());
			LOGGER.error(ex.getMessage());
		}
		return res;
	}
}
