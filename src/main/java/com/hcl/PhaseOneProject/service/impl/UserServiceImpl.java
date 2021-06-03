package com.hcl.PhaseOneProject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.PhaseOneProject.model.User;
import com.hcl.PhaseOneProject.repository.UserRepository;
import com.hcl.PhaseOneProject.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepo;
	
	
	
	public void insertUser(User user) {
		User user2 = new User();
		user2.setUserId(3);
		user2.setPwd("root");
		user2.setRole("USER");
		user2.setUsername("mike");
		userRepo.save(user2);
		List<User> user3 = userRepo.findAll();
		System.out.println(user3);
	}
	
	public void insertUsers(List<User> users) {
		userRepo.saveAll(users);
	}
	public List<User> getAllUsers() {
		
		return userRepo.findAll();
	}
	public User getUserById(long userID) {
		return userRepo.findById(userID).orElse(null);
	}
}
