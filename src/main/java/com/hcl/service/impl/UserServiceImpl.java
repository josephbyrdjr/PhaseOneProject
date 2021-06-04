package com.hcl.service.impl;

import java.util.List;

import com.hcl.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.model.User;
import com.hcl.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;

	public void insertUser(User user) {

		userDao.insertUser(user);
	}
	
	public void insertUsers(List<User> users) {
		userDao.insertUsers(users);
	}
	public List<User> getAllUsers() {
		
		return userDao.getAllUsers();
	}
	public User getUserById(long userID) {
		return userDao.getUserById(userID);
	}
}
