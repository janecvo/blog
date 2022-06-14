package com.example.blog.service;

import com.example.blog.model.BlogPost;
import com.example.blog.model.User;
import com.example.blog.repository.BlogPostRepository;
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
        return this.posts;
    }

    @Override
    public List<BlogPost> findLatest5() {
        return this.posts.stream()
                .sorted((a, b) -> b.getDateTime().compareTo(a.getDateTime()))
                .limit(5)
                .collect(Collectors.toList());
    }

    @Override
    public BlogPost findById(Long id) {
        return this.posts.stream()
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
        for (int i = 0; i < this.posts.size(); i++) {
            if (Objects.equals(this.posts.get(i).getId(), post.getId())) {
                this.posts.set(i, post);
                return post;
            }
        }
        throw new RuntimeException("Post not found: " + post.getId());
    }

    @Override
    public void deleteById(Long id) {
        for (int i = 0; i < this.posts.size(); i++) {
            if (Objects.equals(this.posts.get(i).getId(), id)) {
                this.posts.remove(i);
                return;
            }
        }
        throw new RuntimeException("Post not found: " + id);
    }
}
