package com.bookstore.jpa.repositories;

import com.bookstore.jpa.models.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
