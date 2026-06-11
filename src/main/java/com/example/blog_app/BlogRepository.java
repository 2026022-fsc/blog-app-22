package com.example.blog_app;

import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository
public class BlogRepository {
   private final JdbcClient jdbcClient;

   public BlogRepository(JdbcClient jdbcClient){
      this.jdbcClient=jdbcClient;
   }

   public List<Blog> findAll(){
      return jdbcClient.sql("SELECT id, title, texts FROM blogs")
            .query(Blog.class)
            .list();
   }

   // optional
   public Optional<Blog> findById(Long id){
      return jdbcClient.sql("SELECT id, title, texts FROM blogs WHERE id=:id")
            .param("id",id)
            .query(Blog.class)
            .optional();
   }

   public void save(Blog blog){
      jdbcClient.sql("INSERT INTO blogs (title, texts) VALUES (:title,:texts)")
            .param("title", blog.getTitle())
            .param("texts",blog.getTexts())
            .update();
   }
}
