package com.example.blogsample2.controller;

import com.example.blogsample2.domain.Blog;
import com.example.blogsample2.service.AuthorService;
import com.example.blogsample2.service.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@Controller
public class BlogController {

    private final BlogService blogService;
    private final AuthorService authorService;

    public BlogController(BlogService blogService, AuthorService authorService) {
        this.blogService = blogService;
        this.authorService = authorService;
    }
    @GetMapping("/blog")
    public String create(Model model){
        model.addAttribute("blog",new Blog());
        model.addAttribute("authors",authorService.findAll());
        return "admin/blogForm";
    }
    @PostMapping("/blog")
    public String process(@Valid Blog blog, BindingResult result
            , RedirectAttributes redirectAttributes){
        if(result.hasErrors()){
            return "admin/blogForm";
        }
        blogService.create(blog);
        redirectAttributes.addFlashAttribute("success",true);
        return "redirect:/blogs";
    }
    @GetMapping("/blogs")
    public String showAllBlogs(Model model){
        model.addAttribute("blogs",blogService.findAll());
        model.addAttribute("success",model.containsAttribute("success"));
        return "admin/blogs";
    }

    @ModelAttribute(name = "categories")
    public List<String> categoryNames(){
        return Arrays.asList(
                "Horror",
                "Comedy",
                "Triller",
                "Tragedy",
                "Romance",
                "Adventure",
                "Young Adult",
                "Sports",
                "Travelling"
        );
    }





}
