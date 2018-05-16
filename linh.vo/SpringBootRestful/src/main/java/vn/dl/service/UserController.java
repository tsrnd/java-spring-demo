package vn.dl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import vn.dl.business.UserManager;
import vn.dl.domain.Response;
import vn.dl.domain.User;

@RestController
@RequestMapping("/rest/users")
public class UserController {
	@Autowired
	UserManager userManager;
	
	@GetMapping
	public ResponseEntity<Response> findAll() {
		Response res = new Response();
		List<User> users = userManager.getAllUser();
		res.setData(users);
		return ResponseEntity.ok(res);
	}
	
//	@RequestMapping(value = "/create", method = RequestMethod.POST)
//	public ResponseEntity<Response> createUser(@RequestBody User user) {
//		Response res = new Response();
//		if (userManager.findByUsername(user.getUsername()) != null) {
//			res.setMessage("User da ton tai!");
//		} else {
//			res.setData(userManager.saveUser(user));
//		}
//		return ResponseEntity.ok(res);
//	}
}
