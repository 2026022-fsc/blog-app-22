package com.example.blog_app;

public class Blog {
   private final Long id;
   private final String title;
   private final String texts;

   public Blog(Long id, String title, String texts){
      this.id=id;
      this.title=title;
      this.texts=texts;
   }

   public Long getId() {
      return id;
   }

   public String getTitle() {
      return title;
   }

   public String getTexts() {
      return texts;
   }
}
