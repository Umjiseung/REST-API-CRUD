package com.search.test.service;

import com.search.test.entity.dto.response.BoardCreateResponse;
import com.search.test.entity.dto.response.BoardEditResponse;
import com.search.test.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserService {


    private final UserRepository userRepository;

    public static BoardCreateResponse boardSave() {

    }

    public BoardEditResponse boardEdit() {

    }

}
