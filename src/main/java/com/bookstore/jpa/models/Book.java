package com.bookstore.jpa.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tb_book")
public class Book implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String title;

    public Book(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Book() {
    }

    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
