package com.example1.demo1.service;

import com.example1.demo1.model.User;

import java.util.Optional;

/**
 * @author : Ahsan Ahmad
 * @created on : 2/5/2020, Wed
 **/
public interface UserService {
  Optional<User> getUser(long id);
  void createUser(User user);
  void deleteUserById(long id);
  User updateUser(User user);
}
