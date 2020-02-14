package com.example1.demo1.service.impl;

import com.example1.demo1.model.Publisher;
import com.example1.demo1.repository.PublisherRepository;
import com.example1.demo1.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * @author : Ahsan Ahmad
 * @created on : 2/9/2020, Sun
 **/
@Service
@Transactional
public class PublisherServiceImpl implements PublisherService {

    PublisherRepository publisherRepository;
    @Autowired
    public PublisherServiceImpl(PublisherRepository publisherRepository){
        this.publisherRepository = publisherRepository;
    }
    public Optional<Publisher> getPublisher(Long id){
        Optional<Publisher> publisher = publisherRepository.findById(id);
        return publisher;
    }

    @Override
    public void createPublisher(Publisher publisher) {
        publisherRepository.save(publisher);
    }

    @Override
    public Publisher updatePublisher(Publisher publisher) {
        Publisher publisher1 = publisherRepository.save(publisher);
        return publisher1;
    }

    @Override
    public void deletePublisher(Long id) {
        Optional<Publisher> publisher = publisherRepository.findById(id);
        publisher.ifPresent(publisherRepository :: delete);
    }
}
