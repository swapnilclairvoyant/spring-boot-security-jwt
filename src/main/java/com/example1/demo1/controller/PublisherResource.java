package com.example1.demo1.controller;

import com.example1.demo1.model.Publisher;
import com.example1.demo1.service.PublisherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Ahsan Ahmad
 * @created on : 2/9/2020, Sun
 **/
@Api(value = "this api is to manage publishers")
@RestController
@RequestMapping(value = PublisherResource.BASE_URL)
public class PublisherResource {

    static final String BASE_URL = "/api/v1/publishers";

    PublisherService publisherService;

    @Autowired
    public PublisherResource(PublisherService publisherService){
        this.publisherService = publisherService;
    }

    @ApiOperation(value = "this api is to get a publish using id")
    @RequestMapping(value = "/getPublisher", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void getPublish(@RequestParam Long id){
        publisherService.getPublisher(id);
    }

    @ApiOperation(value = "this api is to create new publish")
    @RequestMapping(value = "/createPublisher", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createPublisher(@RequestBody Publisher publisher){
        publisherService.createPublisher(publisher);
    }

    @ApiOperation(value = "this api is to delete a publish")
    @RequestMapping(value = "/deletePublisher", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deletePublisher(@RequestParam Long id){
        publisherService.deletePublisher(id);
    }

    @ApiOperation(value = "this api is to update already present publisher")
    @RequestMapping(value = "/updatePublisher", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Publisher updatePublisher(@RequestBody Publisher publisher){
        return publisherService.updatePublisher(publisher);
    }
}
