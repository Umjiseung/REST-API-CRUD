package com.search.test.domain.auth.data.dto.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class RegisterRequest {

    private final String email;
    private final String password;

}
