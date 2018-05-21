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

import vn.dl.business.UserManager;
import vn.dl.domain.ExecutionResult;
import vn.dl.domain.Response;
import vn.dl.domain.User;

@RestController
@RequestMapping("/v1/users")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserManager userManager;
	
	@GetMapping
	public ResponseEntity<Response> findAll() {
		Response res = new Response();
		List<User> users = userManager.getAllUser();
		res.setData(users);
		return ResponseEntity.ok(res);
	}
	
	@PostMapping(value = "/add")
	public Object createUser(@RequestBody User user) {
		Response res = new Response();
		try {
			ExecutionResult result = new ExecutionResult();
			result = userManager.insert(user);
			if (result.getResult() == ExecutionResult.Status.Success) {
				res.setSuccess(true);
			}
		} catch (Exception ex) {
			res.setSuccess(false);
			res.setError(ex);
			res.setMessage(ex.getMessage());
			logger.error(ex.getMessage());
		}
		return res;
	}
}
