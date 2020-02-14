package com.example1.demo1.service;

import com.example1.demo1.model.Author;

import java.util.Optional;

/**
 * @author : Ahsan Ahmad
 * @created on : 2/10/2020, Mon
 **/
public interface AuthService {
    void createAuthor(Author author);
    Optional<Author> getAuthor(Long id);
    Author updateAuthor(Author author);
    void deleteAuthor(Long id);
}
