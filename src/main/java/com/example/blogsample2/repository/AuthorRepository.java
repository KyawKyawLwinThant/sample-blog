package com.example.blogsample2.repository;

import com.example.blogsample2.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
