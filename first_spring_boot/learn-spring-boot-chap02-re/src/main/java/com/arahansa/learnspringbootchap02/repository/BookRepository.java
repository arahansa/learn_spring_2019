package com.arahansa.learnspringbootchap02.repository;

import com.arahansa.learnspringbootchap02.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
