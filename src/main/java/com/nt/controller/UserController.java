package com.nt.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nt.model.UserDetails;
import com.nt.model.UserRequest;
import com.nt.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public UserDetails createUser(@RequestBody UserRequest userRequest) {
        UserDetails user=userService.createUser(userRequest.getUsername(), userRequest.getPassword(), userRequest.getName(), userRequest.getRole(), userRequest.getDepartmentId(), userRequest.getEmail());
        return user;
    }
}


