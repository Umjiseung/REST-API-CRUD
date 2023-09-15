package com.search.test.service;

import com.search.test.entity.dto.request.BoardCreateRequest;
import com.search.test.entity.dto.response.BoardCreateResponse;
import com.search.test.entity.dto.response.BoardEditResponse;
import com.search.test.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class UserService {


    private final UserRepository userRepository;

    @Transactional
    public static BoardCreateResponse boardSave(BoardCreateRequest boardCreateRequest) {

    }

    public BoardEditResponse boardEdit() {

    }

}
