package com.example1.demo1.service.impl;

import com.example1.demo1.model.Message;
import com.example1.demo1.repository.MessageRepository;
import com.example1.demo1.repository.UserRepository;
import com.example1.demo1.service.MessageService;
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
public class MessageServiceImpl implements MessageService {
    MessageRepository messageRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    public MessageServiceImpl(MessageRepository messageRepository){
        this.messageRepository = messageRepository;
    }

    public void createMessage(Message message){
        messageRepository.save(message);
    }

   public Optional<Message> getMessage(Long id){
        Optional<Message> message = messageRepository.findById(id);
        return  message;
    }

    public Message updateMessage(Message message){
        Message message1 = messageRepository.save(message);
        return  message1;
    }

    public void deleteMessage(Long id){
        Optional<Message> messageOption = messageRepository.findById(id);
        messageOption.ifPresent(messageRepository :: delete);
     }

}
