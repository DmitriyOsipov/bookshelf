package com.bookshelf.controller;

import com.bookshelf.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;

public class AdminController {

  @Autowired
  BookService bookService;

}
