package com.search.test.doamin.user.dto.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public class RegisterRequest<V> {

    private String email;
    private String password;
}
