package com.bookshelf.repository;

import com.bookshelf.model.Book;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

  Book findById(long id);
  Set<Book> getBooksByAuthors(String author);
  Set<Book> getBooksByGenres(String genre);
  Set<Book> getBooksByTitleLike(String titlePart);

}
