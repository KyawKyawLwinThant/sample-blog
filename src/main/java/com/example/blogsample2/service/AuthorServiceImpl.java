package com.example.blogsample2.service;

import com.example.blogsample2.domain.Author;
import com.example.blogsample2.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;


    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Author create(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Author findAuthor(int id) {
        return this.authorRepository.getOne(id);
    }

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }
}
