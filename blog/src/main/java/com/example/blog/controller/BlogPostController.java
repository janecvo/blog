package com.example.blog.Controller;


import com.example.blog.model.BlogPost;
import com.example.blog.model.User;
import com.example.blog.repository.UserRepository;
import com.example.blog.service.BlogPostService;
import com.example.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BlogPostController {
    //display all posts

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BlogPostService blogPostService;

    
    @GetMapping("/")
    public String home(Model model) {
        List<BlogPost> postList = blogPostService.getAllBlogPosts();
        model.addAttribute("allPosts", postList);
        return "home";
    }

    @GetMapping("/showNewPostForm")
    public String showNewPostForm(Model model) {
        BlogPost blogPost = new BlogPost();
        model.addAttribute("blogPost", blogPost);
        return "new_post";
    }


    @PostMapping("/create")
    public String createPost(@ModelAttribute("blogPost") BlogPost blogPost) {
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        blogPost.setUser(userRepository.findByUsername(name));
        blogPostService.create(blogPost);
        return "redirect:/";
    }

    @GetMapping("/deletePost/{id}")
    public String deletePost(@PathVariable(value = "id") Long id) {
        blogPostService.deletePostById(id);
        return "redirect:/";
    }


    @GetMapping("/logout")
    public String logout() {
        return "logout";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

}
