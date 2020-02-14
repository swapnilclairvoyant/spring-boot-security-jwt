package com.example1.demo1.controller;

import com.example1.demo1.model.User;
import com.example1.demo1.repository.UserRepository;
import com.example1.demo1.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @author : Ahsan Ahmad
 * @created on : 2/5/2020, Wed
 **/
@Api(value = "this class is used to manage users")
@RestController
@RequestMapping(value = UserResource.BASE_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class UserResource {
    UserService userService;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    UserRepository userRepository;

    @Autowired
    public UserResource(UserService userService){
        this.userService = userService;
    }

    static final String BASE_URL = "/api/v1/users";

    @ApiOperation(value = "this api is to get user by id")
    @RequestMapping(value = "/getUser/{userId}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    private Optional<User> getUser(@PathVariable long userId){
        return  userService.getUser(userId);
    }

    @ApiOperation(value = "this operation is to create a new user")
    @RequestMapping(value = "/createUser", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    private void createUser(@RequestBody User user){
        userService.createUser(user);
    }

    @ApiOperation(value = "this operation is to delete a user by id")
    @RequestMapping(value = "/deleteUserById", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
    private void deleteUserById(@RequestParam Long id){
        userService.deleteUserById(id);
    }

    @ApiOperation(value = "this operation is to update a user")
    @RequestMapping(value = "/deleteUserById", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    private void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }

    @ApiOperation(value = "this operation is to sign-up user")
    @RequestMapping(value = "/sign-up", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void signUp(@RequestBody User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }
}
