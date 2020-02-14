package com.example1.demo1.controller;

import com.example1.demo1.model.Message;
import com.example1.demo1.service.MessageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @author : Ahsan Ahmad
 * @created on : 2/9/2020, Sun
 **/
@Api(value = "this api is to manage messages for users")
@RequestMapping(value = MessageResource.BASE_URL)
@RestController
public class MessageResource {

    static final String BASE_URL = "/api/v1/messages";

    private MessageService messageService;

    @Autowired
    public MessageResource(MessageService messageService){
        this.messageService = messageService;
    }

    @ApiOperation(value = "this api is to create a new message")
    @RequestMapping(value = "/createMessage", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createMessage(@RequestBody Message message){
        messageService.createMessage(message);
    }

    @ApiOperation(value = "this api is to get a message using id")
    @RequestMapping(value = "/getMessage", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Message> getMessage(@RequestParam Long id){
        return messageService.getMessage(id);
    }

    @ApiOperation(value = "this api is to delete a message")
    @RequestMapping(value = "/deleteMessage", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteMessage(@RequestParam Long id){
        messageService.deleteMessage(id);
        return ResponseEntity.ok().body(null);
    }

    @ApiOperation(value = "this api is to update a existing message")
    @RequestMapping(value = "/updateMessage", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateMessage(@RequestBody Message message){
        messageService.updateMessage(message);
    }
}
