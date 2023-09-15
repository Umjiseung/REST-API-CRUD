package com.search.test.service;

import com.search.test.dto.request.BoardCreateRequest;
import com.search.test.dto.response.BoardCreateResponse;
import com.search.test.dto.response.BoardEditResponse;
import com.search.test.dto.response.BoardSeeResponse;
import com.search.test.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class UserService {


    private final UserRepository userRepository;

    @Transactional
    public BoardCreateResponse boardSave(BoardCreateRequest boardCreateRequest) {

    }

    @Transactional
    public BoardEditResponse boardEdit(BoardSeeResponse boardSeeResponse) {

    }

}
