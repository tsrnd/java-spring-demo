package vn.asiantech.sbrestful.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import vn.asiantech.sbrestful.repository.UserRepository;
import vn.asiantech.sbrestful.entities.User;

@RestController
@RequestMapping("/rest")
public class UserRestController {
	
	@Autowired 
	private UserRepository userRepository;

	public static HashMap<Integer, User> mapUser = new HashMap<Integer, User>();
	static {
		mapUser.put(1, new User(1, "linh.vo", "123456"));
		mapUser.put(2, new User(2, "admin", "admin1234"));
		mapUser.put(3, new User(3, "su.ho", "123456"));
		mapUser.put(4, new User(4, "hung.nguyen", "1234"));
	}

	// get all users with static db
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public ResponseEntity<List<User>> getAllUserWithStaticDB() {
		List<User> listUser = new ArrayList<User>(mapUser.values());
		return new ResponseEntity<List<User>>(listUser, HttpStatus.OK);
	}
	
	// get all users
	@RequestMapping(value = "/userss", method = RequestMethod.GET)
	public ResponseEntity<List<User>> getAllUser() {
		List<User> listUser = userRepository.findAll();
		return new ResponseEntity<List<User>>(listUser, HttpStatus.OK);
	}

	// get user by id with static db
	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	public ResponseEntity<Object> getUserById(@PathVariable int id) {
		User user = mapUser.get(id);
		if (user != null) {
			return new ResponseEntity<Object>(user, HttpStatus.OK);
		}
		return new ResponseEntity<Object>("Not Found User", HttpStatus.NO_CONTENT);
	}

	// create user with static db
	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public ResponseEntity<String> createUserWithStaticDB(@RequestBody User user) {
		if (mapUser.containsKey(user.getId())) {
			return new ResponseEntity<String>("User Already Exist!", HttpStatus.CONFLICT);
		}
		mapUser.put(user.getId(), user);
		return new ResponseEntity<String>("Created!", HttpStatus.CREATED);
	}
	
	// create user
	@PostMapping(path = "/add")
	public ResponseEntity<String> createUser(@RequestParam String username, @RequestParam String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		userRepository.save(user);
		return new ResponseEntity<String>("Created!", HttpStatus.CREATED);
	}

	// delete user with static db
	@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteUserById(@PathVariable int id) {
		User user = mapUser.get(id);
		if (user == null) {
			return new ResponseEntity<String>("Not Found User", HttpStatus.OK);
		}

		mapUser.remove(id);
		return new ResponseEntity<String>("Deleted!", HttpStatus.OK);
	}

	// update user with static db
	@RequestMapping(value = "/users", method = RequestMethod.PUT)
	public ResponseEntity<String> updateUser(@RequestBody User user) {
		User oldUser = mapUser.get(user.getId());
		if (oldUser == null) {
			return new ResponseEntity<String>("Not Found User", HttpStatus.NO_CONTENT);
		}

		// replace old user by new user.
		mapUser.put(user.getId(), user);
		return new ResponseEntity<String>("Updated!", HttpStatus.OK);
	}
}
