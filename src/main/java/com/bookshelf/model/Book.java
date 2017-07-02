package com.bookshelf.model;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private long id;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "books_genres",
  joinColumns = { @JoinColumn(name = "book_id") },
  inverseJoinColumns = { @JoinColumn(name = "genre_id") })
  private Set<Genre> genres;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "books_authors",
      joinColumns = { @JoinColumn(name = "book_id") },
      inverseJoinColumns = { @JoinColumn(name = "author_id") })
  private Set<Author> authors;

  @Column(name = "title")
  private String title;

  @Column(name = "description")
  private String description;

  @Column(name = "price")
  private double price;

  public Book(Set<Genre> genres, Set<Author> authors, String title, String description,
      double price) {
    this.id = 0;
    this.genres = genres;
    this.authors = authors;
    this.title = title;
    this.description = description;
    this.price = price;
  }

  public Book(String title, String description, double price) {
    this(new LinkedHashSet<>(), new LinkedHashSet<>(), title, description, price);
  }

  public Book() {
    this(new LinkedHashSet<>(), new LinkedHashSet<>(), "None", "None", 0);
  }

  public long getId() {
    return id;
  }

  public Set<Genre> getGenres() {
    return genres;
  }

  public Set<Author> getAuthors() {
    return authors;
  }

  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void addGenre(Genre genre) {
    this.genres.add(genre);
  }

  public void changeGenre(Genre oldGenre, Genre newGenre) {
    this.genres.remove(oldGenre);
    this.genres.add(newGenre);
  }

  public void changeAllGenres(Genre newGenre) {
    this.genres.clear();
    this.genres.add(newGenre);
  }

  public void removeGenre(Genre genre) {
    this.genres.remove(genre);
  }

  public void addAuthor(Author author) {
    this.authors.add(author);
  }

  public void removeAuthor(Author author) {
    this.authors.remove(author);
  }

  public void changeAuthor(Author oldAuthor, Author newAuthor) {
    this.authors.remove(oldAuthor);
    this.authors.add(newAuthor);
  }

  public void changeAllAuthors(Author newAuthor) {
    this.authors.clear();
    this.authors.add(newAuthor);
  }
}
