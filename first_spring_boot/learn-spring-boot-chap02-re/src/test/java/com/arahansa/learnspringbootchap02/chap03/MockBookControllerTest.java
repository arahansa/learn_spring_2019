package com.arahansa.learnspringbootchap02.chap03;

import com.arahansa.learnspringbootchap02.controller.BookController;
import com.arahansa.learnspringbootchap02.domain.Book;
import com.arahansa.learnspringbootchap02.service.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.ModelMap;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

public class MockBookControllerTest {

    BookController bookController;
    BookService bookService;
    ExtendedModelMap model;

    /*
        MockHttpServletRequest
        MockHttpServletResponse,
        BeanPropertyBindingResult
        등의 클래스들을 이용하여 파라미터들을 전달할 수 있다
    */
    @BeforeEach
    void setup(){
        bookService = mock(BookService.class);
        bookController = new BookController(bookService);
        model = new ExtendedModelMap();
    }

    @Test
    void getBookList() {
        Book book = new Book("Spring Boot Book", LocalDateTime.now());
        given(bookService.getBookList()).willReturn(Arrays.asList(book));
        String bookList = bookController.getBookList(model);
        assertThat(bookList).isEqualTo("book");
        List<Book> getBookList = (List<Book>) model.get("bookList");
        assertThat(getBookList).hasSize(1);
        assertThat(getBookList).contains(book);
    }
}
