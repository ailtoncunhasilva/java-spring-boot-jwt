package com.ailtondev.dio.jwt.controller;

import com.ailtondev.dio.jwt.data.UserData;
import com.ailtondev.dio.jwt.service.UserDetailsServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserDetailsServiceImpl userDetailsService;

    public UserController(UserDetailsServiceImpl userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @RequestMapping("/all-users")
    public List<UserData> listAllUser(){
        return userDetailsService.listUsers();
    }
}
