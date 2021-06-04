package com.hcl.service;

import java.util.List;

import com.hcl.model.User;

public interface UserService {
	
	void insertUser(User user);
	void insertUsers(List<User> users);
	List<User> getAllUsers();
	User getUserById(long userID);
}
