package com.example.blog.service;

import com.example.blog.model.BlogPost;
import com.example.blog.model.User;
import com.example.blog.repository.BlogPostRepository;
import com.example.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

@Service
public class BlogPostServiceImpl implements BlogPostService {


    @Autowired
    private BlogPostRepository blogPostRepository;



private List<BlogPost> posts = new ArrayList<BlogPost>();


        @Override
    public List<BlogPost> getAllBlogPosts() {
            return blogPostRepository.findAll();
    }
    @Override
    public List<BlogPost> findAll() {
        return blogPostRepository.findAll();
    }

    @Override
    public List<BlogPost> findLatest5() {
        return blogPostRepository.findAll().stream()
                .sorted((a, b) -> b.getDateTime().compareTo(a.getDateTime()))
                .limit(5)
                .collect(Collectors.toList());
    }

    @Override
    public BlogPost findById(Long id) {
        return blogPostRepository.findAll().stream()
                .filter(p -> Objects.equals(p.getId(), id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void create(BlogPost post) {
            blogPostRepository.save(post);
    }


    @Override
    public BlogPost edit(BlogPost post) {
        for (int i = 0; i < blogPostRepository.findAll().size(); i++) {
            if (Objects.equals(blogPostRepository.findAll().get(i).getId(), post.getId())) {
                blogPostRepository.findAll().set(i, post);
                return post;
            }
        }
        throw new RuntimeException("Post not found: " + post.getId());
    }

    @Override
    public void deleteById(Long id) {
        for (int i = 0; i < blogPostRepository.findAll().size(); i++) {
            if (Objects.equals(blogPostRepository.findAll().get(i).getId(), id)) {
                blogPostRepository.findAll().remove(i);
                return;
            }
        }
        throw new RuntimeException("Post not found: " + id);
    }

    @Override
    public void deletePostById(Long id) {
        blogPostRepository.deleteById(id);
    }
}
