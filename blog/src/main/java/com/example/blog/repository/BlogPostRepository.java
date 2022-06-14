package com.example.blog.repository;

import com.example.blog.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {

    @Query("SELECT p FROM BlogPost p LEFT JOIN FETCH p.user ORDER BY p.dateTime DESC")
    List<BlogPost> findLatest5();
}
