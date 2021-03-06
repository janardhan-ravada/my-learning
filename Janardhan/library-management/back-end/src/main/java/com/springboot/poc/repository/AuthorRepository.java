package com.springboot.poc.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.springboot.poc.model.Author;

@Repository
public interface AuthorRepository
        extends PagingAndSortingRepository<Author, Long> {

    List<Author> findAll();
    Author findByName(String name);
}
