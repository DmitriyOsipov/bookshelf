package com.bookshelf.repository;

import com.bookshelf.model.Author;

import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface AuthorRepository extends CrudRepository<Author, Long> {

  Author findByName(String name);
}
