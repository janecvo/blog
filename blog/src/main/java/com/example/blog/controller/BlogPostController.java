package com.example.blog.Controller;

import com.example.blog.service.BlogPostService;
import com.example.blog.service.BlogPostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogPostController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    // display all posts
    @GetMapping("/")
    public String home() {
        return "index";
    }
}
