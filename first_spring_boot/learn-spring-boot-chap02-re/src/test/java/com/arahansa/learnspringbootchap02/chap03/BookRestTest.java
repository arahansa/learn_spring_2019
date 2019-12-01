package com.arahansa.learnspringbootchap02.chap03;

import com.arahansa.learnspringbootchap02.domain.Book;
import com.arahansa.learnspringbootchap02.service.BookRestService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.HttpServerErrorException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withServerError;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

@RestClientTest(value = BookRestService.class)
public class BookRestTest {
    @Autowired
    BookRestService bookRestService;
    @Autowired
    MockRestServiceServer server;

    @Test
    void rest_테스트() {
        this.server.expect(requestTo("/rest/test")).andRespond(withSuccess(new ClassPathResource("/test.json", getClass()),  MediaType.APPLICATION_JSON));
        Book book = this.bookRestService.getRestBook();
        assertThat(book.getTitle()).isEqualTo("테스트");
    }

    @Test
    void rest_error_테스트() {
        this.server.expect(requestTo("/rest/test")).andRespond(withServerError());
        Assertions.assertThrows(HttpServerErrorException.class, () -> this.bookRestService.getRestBook());
    }

}
