package com.hcl.PhaseOneProject.service.impl;

import java.util.List;

import com.hcl.PhaseOneProject.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.PhaseOneProject.model.User;
import com.hcl.PhaseOneProject.repository.UserRepository;
import com.hcl.PhaseOneProject.service.UserService;

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
