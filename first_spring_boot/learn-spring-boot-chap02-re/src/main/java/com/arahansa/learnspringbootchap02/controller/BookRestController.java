package com.arahansa.learnspringbootchap02.controller;

import com.arahansa.learnspringbootchap02.domain.Book;
import com.arahansa.learnspringbootchap02.service.BookRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookRestController {

    @Autowired
    private BookRestService bookRestService;

    @GetMapping(path = "/rest/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public Book getRestBooks(){
        return bookRestService.getRestBook();
    }
}
