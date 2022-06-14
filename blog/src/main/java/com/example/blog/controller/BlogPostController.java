package com.example.blog.Controller;


import com.example.blog.model.BlogPost;
import com.example.blog.service.BlogPostService;
import com.example.blog.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class BlogPostController {
    //display all posts

    @Autowired
    private BlogPostService blogPostService;

    @Autowired
    private NotificationService notifyService;
    @GetMapping("/")
    public String home(Model model) {
        List<BlogPost> latest5Posts = blogPostService.findLatest5();
        model.addAttribute( "latest5posts", latest5Posts);

        List<BlogPost> latest3Posts = latest5Posts.stream()
                .limit(3).collect(Collectors.toList());
        model.addAttribute("latest3posts",latest3Posts);
        return "home";
    }


//    @GetMapping("/logout")
//    public String logout() {
//        return "logout";
//    }
//
//    @GetMapping("/login")
//    public String login() {
//        return "login";
//    }

    @RequestMapping("/posts/User/{id}")
    public String User(@PathVariable("id") Long id, Model model) {
        BlogPost post = blogPostService.findById(id);
        if (post == null) {
            notifyService.addErrorMessage("Cannot find post #" + id);
            return "redirect:/";
        }
        model.addAttribute("post", post);
        return "posts/user";
    }

    @RequestMapping("/posts/User")
    public String User(Model model) {
        List<BlogPost> latest5Posts = blogPostService.findLatest5();
        model.addAttribute( "latest5posts", latest5Posts);
        return "/posts/User";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable (value = "id") long id) {
        this.blogPostService.deleteById(id);
        return "redirect:/";
    }
//    @GetMapping("/editblogpost/{id}")
//    public String editblogpost(Model model) {
//        // create model attribute to bind form data
//        BlogPost blogPost = new BlogPost();
//        model.addAttribute("blogPost", blogPost);
//        return "editpost";
//    }
    @PostMapping("/editpost")
    public String edit(@ModelAttribute("BlogPost") BlogPost post) {
        // save employee to database
        blogPostService.edit(post);
        return "redirect:/posts/user";
    }

}
