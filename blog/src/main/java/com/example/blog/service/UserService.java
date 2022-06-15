package com.example.blog.service;

<<<<<<< HEAD
import com.example.blog.model.User;
import com.example.blog.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
=======
//import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {

        boolean authenticate(String username, String password);
>>>>>>> 9631e3c5d39b2380a361072705344ce6b2006d01
}
