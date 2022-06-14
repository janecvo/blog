package com.example.blog.web.dto;

import com.example.blog.web.UserRegistrationController;

public class UserRegistrationDto {

    private Long id;

    public Long getId() {
        return id;
    }

    private String username;
    private String email;
    private String fullName;
    private String password;

    public UserRegistrationDto() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
