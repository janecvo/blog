package com.example.blog.service;

import com.example.blog.model.BlogPost;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface BlogPostService {
    List<BlogPost> getAllBlogPosts();
    List<BlogPost> findAll();
    List<BlogPost> findLatest5();
    BlogPost findById(Long id);
    void create(BlogPost post);


    BlogPost edit(BlogPost post);

    void deleteById(Long id);

    void deletePostById(Long id);
}
