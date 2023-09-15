package com.search.test.controller;


import com.search.test.entity.dto.request.BoardCreateRequest;
import com.search.test.entity.dto.response.BoardCreateResponse;
import com.search.test.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @PostMapping("/write")
    public BoardCreateResponse writeBoard(@RequestBody BoardCreateRequest boardCreateRequest) {
        return UserService.boardSave(boardCreateRequest);
    }


}
