package com.example.graphql.controller;

import com.example.graphql.model.Book;
import com.example.graphql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    BookService bookService;

    @QueryMapping
    public List<Book> findAllBooks() {
        return bookService.findAll();
    }
}
