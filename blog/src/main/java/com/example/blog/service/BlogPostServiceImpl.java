//package com.example.blog.service;
//
//import com.example.blog.model.BlogPost;
//import com.example.blog.model.User;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Objects;
//import java.util.Scanner;
//import java.util.stream.Collectors;
//
//@Service
//public class BlogPostServiceImpl implements BlogPostService {
//
////    @Autowired
////    private BlogPostRepository blogPostRepository;
////
////
//
//private List<BlogPost> posts = new ArrayList<BlogPost>() {{
//    add(new BlogPost(1L, "First Post", "<p>Line #1.</p><p>Line #2</p>", null));
//    add(new BlogPost(2L, "Second Post",
//            "Second post content:<ul><li>line 1</li><li>line 2</li></p>",
//            new User(10L, "pesho10", "Peter Ivanov")));
//    add(new BlogPost(3L, "Post #3", "<p>The post number 3 nice</p>",
//            new User(10L, "merry", null)));
//    add(new BlogPost(4L, "Forth Post", "<p>Not interesting post</p>", null));
//    add(new BlogPost(5L, "Post Number 5", "<p>Just posting</p>", null));
//    add(new BlogPost(6L, "Sixth Post", "<p>Another interesting post</p>", null));
//}};
//
//
////        @Override
////    public List<BlogPost> getAllBlogPosts() {
////            return findAll();
////    }
//    @Override
//    public List<BlogPost> findAll() {
//        return this.posts;
//    }
//
//    @Override
//    public List<BlogPost> findLatest5() {
//        return this.posts.stream()
//                .sorted((a, b) -> b.getDateTime().compareTo(a.getDateTime()))
//                .limit(5)
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    public BlogPost findById(Long id) {
//        return this.posts.stream()
//                .filter(p -> Objects.equals(p.getId(), id))
//                .findFirst()
//                .orElse(null);
//    }
//
//    @Override
//    public BlogPost create(BlogPost post) {
//        post.setId(this.posts.stream().mapToLong(
//                p -> p.getId()).max().getAsLong() + 1);
//        this.posts.add(post);
//        return post;
//    }
//
//    @Override
//    public BlogPost edit(BlogPost post) {
//        for (int i = 0; i < this.posts.size(); i++) {
//            if (Objects.equals(this.posts.get(i).getId(), post.getId())) {
//                this.posts.set(i, post);
//                return post;
//            }
//        }
//        throw new RuntimeException("Post not found: " + post.getId());
//    }
//
//    @Override
//    public void deleteById(Long id) {
//        for (int i = 0; i < this.posts.size(); i++) {
//            if (Objects.equals(this.posts.get(i).getId(), id)) {
//                this.posts.remove(i);
//                return;
//            }
//        }
//        throw new RuntimeException("Post not found: " + id);
//    }
//}
