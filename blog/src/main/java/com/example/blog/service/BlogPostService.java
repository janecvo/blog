package com.example.blog.service;

import com.example.blog.model.BlogPost;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface BlogPostService {
//    List<BlogPost> getAllBlogPosts();
    List<BlogPost> findAll();
    List<BlogPost> findLatest5();

    BlogPost findById(Long id);
<<<<<<< HEAD
    void create(BlogPost post);

=======

    BlogPost create(BlogPost post);
>>>>>>> 9631e3c5d39b2380a361072705344ce6b2006d01

     BlogPost edit(BlogPost post);

    void deleteById(Long id);

    void deletePostById(Long id);
}
