package com.chen.service;

import com.chen.domian.User;

import java.util.List;

public interface IUserService  {
    List<User> findAll();
    User findById(Integer userId);
    void updateUser(User user);
}
