package com.example1.demo1.controller;

import com.example1.demo1.model.Book;
import com.example1.demo1.service.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


/**
 * @author : Ahsan Ahmad
 * @created on : 2/9/2020, Sun
 **/
@Api(value = "this api is to handle books")
@RestController
@RequestMapping(value = PublisherResource.BASE_URL)
public class BookResource {
    static final String BASE_URL = "/api/v1/books";

    @Autowired
    BookService bookService;

    @ApiOperation(value = "this api is to create a new book")
    @RequestMapping(value = "/createBook", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void createBook(@RequestBody Book book){
        bookService.createBook(book);
    }

    @ApiOperation(value = "this api is to get a book using id")
    @RequestMapping(value = "/getBook", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Book> getBook(@RequestParam Long id){
        return bookService.getBook(id);
    }

    @ApiOperation(value = "this api is to delete a book")
    @RequestMapping(value = "/deleteBook", method = RequestMethod.DELETE)
    public void deleteBook(@RequestParam Long id){
        bookService.deleteBook(id);
    }

    @ApiOperation(value = "this api is to update a existing book")
    @RequestMapping(value = "/updateBook", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Book updateBook(@RequestBody Book book){
      return bookService.updateBook(book);
    }

    @ApiOperation(value = "this api is getUsersByBook")
    @RequestMapping(value = "/getUserByBook", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Book getUserByBooks(@RequestBody Book book){
        return bookService.updateBook(book);
    }
}
