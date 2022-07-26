package com.example.pp_3_1_4_rest.controllers;

import com.example.pp_3_1_4_rest.entity.User;
import com.example.pp_3_1_4_rest.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping ("/api/user")
public class UserRestController {

    private final UserService userService;

    public UserRestController(UserService userService) {this.userService = userService;}

    @GetMapping
    public User getAuthorisedUser (Principal principal) {
        return userService.findByUsername(principal.getName());
    }
}
