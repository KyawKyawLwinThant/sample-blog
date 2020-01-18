package com.example.blogsample2.service;

import com.example.blogsample2.domain.Author;

import java.util.List;

public interface AuthorService {

    Author create(Author author);
    Author findAuthor(int id);
    List<Author> findAll();

}
