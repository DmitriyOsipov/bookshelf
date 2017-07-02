package com.bookshelf.service;

import com.bookshelf.exceptions.BookNotFoundException;
import com.bookshelf.model.Book;
import com.bookshelf.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class BookService {

  @Autowired
  BookRepository repository;

  public Book addNew(Book book) {
    return repository.save(book);
  }

  public Book update(Book book) throws BookNotFoundException {
    if (repository.findById(book.getId()) == null) {
      throw new BookNotFoundException();
    }
    return repository.save(book);
  }

  public void delete(Book book) throws BookNotFoundException {
    if (repository.findById(book.getId()) == null) {
      throw new BookNotFoundException();
    }
    repository.delete(book);
  }

  public Set<Book> getBooksByGenre(String genre) {
    return repository.getBooksByGenres(genre);
  }

  public Set<Book> getBooksByAuthor(String authorName) {
    return repository.getBooksByAuthors(authorName);
  }
}
