package com.example.blog.service;

import java.util.Objects;

//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImp implements UserService {
    @Override
    public boolean authenticate(String username, String password) {
        return Objects.equals(username, password);
    }

//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        return null;
//    }
}
