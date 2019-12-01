package com.arahansa.learnspringbootchap02.service;

import com.arahansa.learnspringbootchap02.domain.Book;

import java.util.List;

public interface BookService {
    List<Book> getBookList();
}
