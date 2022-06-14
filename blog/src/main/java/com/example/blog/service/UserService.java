package com.example.blog.service;

//import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {

        boolean authenticate(String username, String password);
}
