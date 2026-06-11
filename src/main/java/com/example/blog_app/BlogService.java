package com.example.blog_app;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class BlogService {
   private final BlogRepository blogRepository;

   public BlogService(BlogRepository blogRepository){
      this.blogRepository=blogRepository;
   }

   public List<Blog> getAllBlogs(){
      return blogRepository.findAll();
   }
   
   public Optional<Blog> findById(Long id){
      return blogRepository.findById(id);
   }

   public void save(BlogForm form){
      Blog blog = new Blog(null, form.getTitle(), form.getTexts());
      blogRepository.save(blog);
   }
}
