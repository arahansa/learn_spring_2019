package com.arahansa.learnspringbootchap02.service;

import com.arahansa.learnspringbootchap02.domain.Book;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Override
    public List<Book> getBookList() {
        return Collections.emptyList();
    }
}
