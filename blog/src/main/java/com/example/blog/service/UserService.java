package com.example.blog.service;

import com.example.blog.model.User;

import java.util.List;

public interface UserService {
//    boolean authenticate(String username, String password);
    List<User> getAllUsers();

}
