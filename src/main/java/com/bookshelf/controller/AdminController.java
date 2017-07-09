package com.bookshelf.controller;

import com.bookshelf.model.Book;
import com.bookshelf.service.BookService;

import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/admin")
public class AdminController {

  @Autowired
  BookService bookService;

  @RequestMapping(method = RequestMethod.GET)
  public String showBooks(ModelMap model) {
    model.addAttribute("books", bookService.getAll());
    return "admin//books";
  }
}
