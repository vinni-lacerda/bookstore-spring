package com.bookstore.jpa.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table("tb_book")
public class Book implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;


}
