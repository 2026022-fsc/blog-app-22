package com.example.blog_app;

public class BlogForm {
   private String title;
   private String texts;

   BlogForm(String title, String texts){
      this.title=title;
      this.texts=texts;
   }

   public String getTitle() {
      return title;
   }
   public void setTitle(String title) {
      this.title = title;
   }

   public String getTexts() {
      return texts;
   }
   public void setTexts(String texts) {
      this.texts = texts;
   }

}
