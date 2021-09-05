package com.clearsky.springboot.service;

import com.clearsky.springboot.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Integer id);
    String add(User user);
    String update(User user);
    String del(User user);
}
