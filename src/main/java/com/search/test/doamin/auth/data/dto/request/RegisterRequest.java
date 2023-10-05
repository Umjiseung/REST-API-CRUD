package com.search.test.doamin.auth.data.dto.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class RegisterRequest {

    private final String email;
    private final String password;

}
