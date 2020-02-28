package com.nobelit.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.nobelit.demo.model.User;
import com.nobelit.demo.services.UserService;

@org.springframework.web.bind.annotation.RestController
public class UserController {

	@Autowired
	private UserService uService;
	
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return uService.getAllUsers();
	}
	
	@GetMapping("/users/{userid}")
	public User getUserById(@PathVariable(name="userid") int userid) {
		return uService.getUserById(userid);
	}
	
	@DeleteMapping("/users/{userid}")
	public void deleteUserById(@PathVariable(name="userid") int userid) {
		uService.deleteUserById(userid);
	}
	
	@PostMapping("/users")
	public User saveUser(@RequestBody User user) {
		return uService.saveOrUpdate(user);
	}
	@PutMapping("/users")
	public User updateUser(@RequestBody User user) {
		return uService.saveOrUpdate(user);
	}
}
