package com.search.test.doamin.auth.controller;


import com.search.test.doamin.auth.data.dto.request.LoginRequest;
import com.search.test.doamin.auth.data.dto.request.RegisterRequest;
import com.search.test.doamin.auth.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<Void> register(@RequestBody RegisterRequest registerRequest) {
        authService.register(registerRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<Void> login(@RequestBody LoginRequest loginRequest) {
        authService.login(loginRequest);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/logout")
    public ResponseEntity<Void> logout(){

    }

    @PutMapping("/refresh")
    public ResponseEntity<> refresh() {

    }

}
