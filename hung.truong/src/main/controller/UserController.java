package main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import main.business.UserManager;
import main.business.UserSubscriberManager;
import main.domain.ResponseData;
import main.domain.entity.User;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

	@Autowired
	private UserManager userManager;

	@Autowired
	private UserSubscriberManager subscriberManager;

	@GetMapping("/getAllUsers")
	public ResponseEntity<ResponseData> getAllUsers() {
		ResponseData result = ResponseData.builder().data(userManager.getAllUsers()).success(true).build();
		return ResponseEntity.ok(result);
	}

	@PostMapping("/addUser")
	public ResponseEntity<ResponseData> addUser(@RequestParam(name = "username", required = true) String username,
			@RequestParam(name = "fullname", required = true) String fullname,
			@RequestParam(name = "address", required = false, defaultValue = "Address") String address) {
		User user = new User(null, username, fullname, address);
		ResponseData result = userManager.addUser(user);
		return ResponseEntity.status(result.getStatus()).body(result);
	}

	@GetMapping("/{userId}/user")
	public ResponseEntity<ResponseData> getUser(@PathVariable("userId") long userId) {
		ResponseData result = userManager.getUserById(userId);
		return ResponseEntity.status(result.getStatus()).body(result);
	}

	@PutMapping(name = "/{userId}/user", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ResponseData> editUser(@PathVariable("userId") long userId, @RequestBody User user) {
		user.setUserId(userId);
		ResponseData result = userManager.editUser(user);
		return ResponseEntity.status(result.getStatus()).body(result);
	}

	@DeleteMapping("/{userId}/user")
	public ResponseEntity<ResponseData> deleteUser(@PathVariable("userId") long userId) {
		ResponseData result = userManager.deleteUser(userId);
		return ResponseEntity.status(result.getStatus()).body(result);
	}

	@GetMapping("/{username}")
	public ResponseEntity<ResponseData> getUserByName(@PathVariable("username") String username) {
		return ResponseEntity.ok(userManager.getUserByName(username));
	}

	@GetMapping("/{userId}/subscribers")
	public ResponseEntity<ResponseData> getSubscribers(@PathVariable("userId") long userId) {
		return subscriberManager.getSubscribers(userId);
	}
}
