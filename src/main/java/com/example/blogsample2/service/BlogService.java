package com.example.blogsample2.service;

import com.example.blogsample2.domain.Blog;

import java.util.List;

public interface BlogService {
    Blog create(Blog blog);
    Blog findById(int id);
    List<Blog> findAll();
    void deleteById(int id);

    void update(int id,Blog blog);

}
