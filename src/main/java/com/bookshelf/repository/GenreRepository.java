package com.bookshelf.repository;

import com.bookshelf.model.Genre;

import org.springframework.data.repository.CrudRepository;

public interface GenreRepository extends CrudRepository<Genre, Long> {

  Genre findByName(String genreName);
}
