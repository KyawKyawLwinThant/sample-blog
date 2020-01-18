package com.example.blogsample2.repository;

import com.example.blogsample2.domain.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog,Integer> {
}
