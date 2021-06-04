package com.hcl.PhaseOneProject.dao;

import com.hcl.PhaseOneProject.model.User;

import java.util.List;

public interface UserDao {
    void insertUser(User user);
    void insertUsers(List<User> users);
    List<User> getAllUsers();
    User getUserById(Long userId);
}
