package com.nobelit.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nobelit.demo.model.User;
import com.nobelit.demo.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo uRepo;

	public List<User> getAllUsers() {
		return uRepo.findAll();
	}

	public User getUserById(int userid) {
		Optional<User> findById = uRepo.findById(userid);
		return findById.get();
	}

	public User saveOrUpdate(User user) {
		return uRepo.save(user);
	}

	public void deleteUserById(int userid) {
		uRepo.deleteById(userid);
	}

}
