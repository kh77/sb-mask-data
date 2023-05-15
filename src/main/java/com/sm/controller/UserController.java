package com.sm.controller;

import com.sm.dto.User;
import com.sm.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {


    private final UserService userService;

    @GetMapping
    public List<User> findAllUsers() {
        return userService.findAll();
    }


}
