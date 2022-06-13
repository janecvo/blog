package com.example.blog.controller;


import com.example.blog.model.User;
import com.example.blog.repository.BlogPostRepository;
import com.example.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class BlogPostController {

    @Autowired
    private BlogPostRepository blogPostRepository ;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String getBlogPostInformation(Model model) {
//        List<BlogPost> allPosts = blogPostRepository.findAll();
//        model.addAttribute("posts", allPosts);
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "home";
    }

    @GetMapping("/logout")
    public String logout() {
        return "logout";
    }

    @RequestMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
