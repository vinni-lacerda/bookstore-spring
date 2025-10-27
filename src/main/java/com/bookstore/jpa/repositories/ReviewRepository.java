package com.bookstore.jpa.repositories;

import com.bookstore.jpa.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
