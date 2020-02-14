package com.example1.demo1.controller;

import com.example1.demo1.model.Author;
import com.example1.demo1.service.AuthService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @author : Ahsan Ahmad
 * @created on : 2/10/2020, Mon
 **/

@Api(value = "this api is to maintain authors")
@RestController
@RequestMapping(value = AuthorResource.BASE_URL)
public class AuthorResource {
    static final String BASE_URL = "/api/v1/authors";

    AuthService authService;

    @Autowired
    public AuthorResource(AuthService authService){
        this.authService = authService;
    }

    @GetMapping(value = "/getAuthor")
    @ApiOperation(value = "this api is to get author by id")
    public Optional<Author> getAuthor(@RequestParam Long id){
        return authService.getAuthor(id);
    }

    @PutMapping(value = "/createAuthor")
    @ApiOperation(value = "this api is to create new author")
    public void createAuthor(@RequestBody Author author){
        authService.createAuthor(author);
    }

    @PutMapping(value = "/updateAuthor")
    @ApiOperation(value = "this api is to update existing author")
    public void updateAuthor(@RequestBody Author author){
        authService.updateAuthor(author);
    }

    @DeleteMapping(value = "/deleteAuthor")
    @ApiOperation(value = "this api is to update existing author")
    public void deleteAuthor(@RequestParam Long id){
        authService.deleteAuthor(id);
    }
}
