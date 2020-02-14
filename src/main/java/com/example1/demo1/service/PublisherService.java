package com.example1.demo1.service;

import com.example1.demo1.model.Publisher;

import java.util.Optional;

/**
 * @author : Ahsan Ahmad
 * @created on : 2/9/2020, Sun
 **/
public interface PublisherService {
    void createPublisher(Publisher publisher);
    Optional<Publisher> getPublisher(Long id);
    Publisher updatePublisher(Publisher publisher);
    void deletePublisher(Long id);
}
