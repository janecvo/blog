package com.example.blog.service;


import com.example.blog.model.BlogPost;
import com.example.blog.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
//@EntityManagerFactory
public class BlogPostServiceJpaImp implements BlogPostService {


        @Autowired
        private BlogPostRepository postRepo;

    @Override
        public List<BlogPost> findAll() {
            return this.postRepo.findAll();
        }

        @Override
        public List<BlogPost> findLatest5() {
            return this.postRepo.findLatest5();
        }

//        @Override
//        public BlogPost findById(Long id) {
//            return null;
//        }

        @Override
        public BlogPost findById(Long id) {
            Optional<BlogPost> blog = this.postRepo.findById(id);
            BlogPost blogPost = null;
            if (blog.isPresent()){
                blogPost = blog.get();
            } else
                throw new RuntimeException("BlogPost not found");
            return blogPost;
        }

    @Override
    public BlogPost create(BlogPost post) {
        return null;
    }

    @Override
    public BlogPost edit(BlogPost post) {

        return this.postRepo.save(post);
    }

    @Override
    public void deleteById(Long id) {
        this.postRepo.deleteById(id);
    }

}
