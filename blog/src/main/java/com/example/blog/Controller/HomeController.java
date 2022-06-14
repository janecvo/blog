//<<<<<<< HEAD
package com.example.blog.Controller;
import com.example.blog.model.BlogPost;
import com.example.blog.service.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

//@Controller
//    public class HomeController {
//
//    @Autowired
//    private BlogPostService blogPostService;
//    @GetMapping("/")
//    public String home(Model model) {
//        List<BlogPost> latest5Posts = blogPostService.findLatest5();
//        model.addAttribute( "latest5posts", latest5Posts);
//
//        List<BlogPost> latest3Posts = latest5Posts.stream()
//                .limit(3).collect(Collectors.toList());
//        model.addAttribute("latest3posts",latest3Posts);
//        return "home";
//    }


//        @GetMapping("/logout")
//        public String logout() {
//            return "logout";
//        }
//
//        @GetMapping("/login")
//        public String login() {
//            return "login";
//        }
//
//    }
//=======
////package com.example.blog.controller;
////import org.springframework.stereotype.Controller;
////import org.springframework.web.bind.annotation.RequestMapping;
////
////@Controller
////    public class HomeController {
////        @RequestMapping("/")
////        public String home() {
////            return "home";
////        }
////    }
//>>>>>>> 75fe6b097bde5560264c27274f70b486939c8f11
