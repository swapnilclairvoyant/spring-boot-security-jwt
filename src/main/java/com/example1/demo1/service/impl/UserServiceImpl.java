package com.example1.demo1.service.impl;

import com.example1.demo1.model.User;
import com.example1.demo1.repository.UserRepository;
import com.example1.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * @author : Ahsan Ahmad
 * @created on : 2/5/2020, Wed
 **/
@Service
@Transactional
public class UserServiceImpl implements UserService {

    UserRepository userRepository;
    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;
    public Optional<User> getUser(long id){
        Optional<User> user = userRepository.findById(id);
        return user;
    }

    @Override
    public void createUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    @Override
    public void deleteUserById(long id){
        Optional<User> user = userRepository.findById(id);
        user.ifPresent(userRepository :: delete);
    }

    @Override
    public User updateUser(User user){
        User user1 = userRepository.save(user);
        return user1;
    }
}
