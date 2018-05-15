package vn.dl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.dl.business.BookManager;
import vn.dl.business.UserManager;
import vn.dl.domain.Book;
import vn.dl.domain.Response;

@RestController
@RequestMapping("/rest/books")
public class BookController {

	@Autowired
	BookManager bookManager;
	
	@Autowired
	UserManager userManager;
	
	@GetMapping
	public ResponseEntity<Response> findAll() {
		Response res = new Response();
		List<Book> books = bookManager.findAll();
		res.setData(books); 
		return ResponseEntity.ok(res);
	}
	
	@PostMapping
	public ResponseEntity<Response> saveBook(@RequestBody Book payload) {
		Response res = new Response();
		if (userManager.getUserById(payload.getUser().getId()) != null) {
			res.setData(bookManager.saveBook(payload));
		} else {
			res.setMessage("ko tim thay user!");
		}
		return ResponseEntity.ok(res);
	}
}
