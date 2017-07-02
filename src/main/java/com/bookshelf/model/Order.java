package com.bookshelf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "address")
  private String address;

  @OneToMany
  @JoinColumn(name = "id")
  private Book book;

  @Column(name = "quantity")
  private int quantity;

  public Order(String firstName, String lastName, String address, Book book, int quantity) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.book = book;
    this.quantity = quantity;
  }

  public long getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getAddress() {
    return address;
  }

  public Book getBook() {
    return book;
  }

  public int getQuantity() {
    return quantity;
  }
}
