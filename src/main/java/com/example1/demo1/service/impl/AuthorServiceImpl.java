package com.example1.demo1.service.impl;

import com.example1.demo1.model.Author;
import com.example1.demo1.repository.AuthorRepository;
import com.example1.demo1.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * @author : Ahsan Ahmad
 * @created on : 2/10/2020, Mon
 **/
@Service
@Transactional
public class AuthorServiceImpl implements AuthService {

    AuthorRepository authorRepository;

    @Autowired
    public AuthorServiceImpl(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    @Override
    public void createAuthor(Author author) {
        authorRepository.save(author);
    }

    @Override
    public Optional<Author> getAuthor(Long id) {
        return authorRepository.findById(id);
    }

    @Override
    public Author updateAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public void deleteAuthor(Long id) {
        Optional<Author> author = authorRepository.findById(id);
        author.ifPresent(authorRepository :: delete);
    }
}
