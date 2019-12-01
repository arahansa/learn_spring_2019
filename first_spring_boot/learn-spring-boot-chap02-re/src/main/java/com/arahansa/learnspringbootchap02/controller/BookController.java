package com.arahansa.learnspringbootchap02.controller;

import com.arahansa.learnspringbootchap02.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    private BookService bookService;

    @GetMapping("/books")
    public String getBookList(Model model){
        model.addAttribute("bookList", bookService.getBookList());
        return "book";
    }
}

