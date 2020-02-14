package com.example1.demo1.controller;

import com.example1.demo1.model.Auth;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@Api("Authentication")
@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class AuthApiResource {
    @ApiOperation(value = "Login", notes = "Login with the given credentials.")
    @ApiResponses({@ApiResponse(code = 200, message = "", response = Authentication.class)})
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public void login(@RequestBody Auth auth) {
        throw new IllegalStateException("Add Spring Security to handle authentication");
    }
}
