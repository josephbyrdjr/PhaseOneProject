package com.hcl.PhaseOneProject.service;

import java.util.List;

import com.hcl.PhaseOneProject.model.*;

public interface UserService {
	
	void insertUser(User user);
	void insertUsers(List<User> users);
	List<User> getAllUsers();
	User getUserById(long userID);
}
