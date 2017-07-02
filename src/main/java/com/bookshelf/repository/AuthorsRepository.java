package com.bookshelf.repository;

import com.bookshelf.model.Author;

import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface AuthorsRepository extends CrudRepository<Author, Long> {

  boolean findAuthorsByNameExists(Set<String> authors);
}
