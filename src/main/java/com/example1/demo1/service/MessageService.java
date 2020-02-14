package com.example1.demo1.service;

import com.example1.demo1.model.Message;

import java.util.Optional;

/**
 * @author : Ahsan Ahmad
 * @created on : 2/9/2020, Sun
 **/
public interface MessageService {
    void createMessage(Message message);
    Optional<Message> getMessage(Long id);
    Message updateMessage(Message message);
    void deleteMessage(Long id);
}
