package com.example.graphql.service;

import com.example.graphql.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    public List<Book> findAll() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("5412", "The Two Towers", "kfdfd", 1005));
        books.add(new Book("5541", "Return of the KIng", "kfdfd", 1500));
        return books;
    }
}