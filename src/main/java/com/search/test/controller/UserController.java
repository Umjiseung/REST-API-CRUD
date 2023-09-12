package com.search.test.controller;


import com.search.test.entity.User;
import com.search.test.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {


    private UserService userService;

    @GetMapping("")
    public List<User> getAllUser() {
        return userService.getUser();
    }


}
