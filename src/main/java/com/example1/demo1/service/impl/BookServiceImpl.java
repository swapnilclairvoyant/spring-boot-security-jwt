package com.example1.demo1.service.impl;

import com.example1.demo1.model.Book;
import com.example1.demo1.model.User;
import com.example1.demo1.repository.BookRepository;
import com.example1.demo1.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * @author : Ahsan Ahmad
 * @created on : 2/9/2020, Sun
 **/
@Service
@Transactional
public class BookServiceImpl implements BookService {

    BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    public void createBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Optional<Book> getBook(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Long id) {
        Optional<Book> book = bookRepository.findById(id);
        book.ifPresent(bookRepository :: delete);
    }

    public List<User> getUserByBooks(Long userId){
        return null;
    }
}
