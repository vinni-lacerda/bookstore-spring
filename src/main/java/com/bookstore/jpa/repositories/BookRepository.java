package com.bookstore.jpa.repositories;

import com.bookstore.jpa.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    Book findBookByTitle(String title);

}
