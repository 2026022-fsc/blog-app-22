package com.example.blog_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class BlogController {
   @GetMapping("/blogs")
   public String blogs() {
       return "blogs";
   }

   @GetMapping("/blogs/newPost")
   public String newPost() {
       return "blogs/newPost";
   }
   
}
