package com.search.test.user.controller;


import com.search.test.user.dto.request.RegisterRequest;
import com.search.test.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<Void> register(@RequestBody RegisterRequest registerRequest) {
        return new ResponseEntity<>(userService.regist(registerRequest), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public RegisterRequest<Void> login(@RequestBody )

}
