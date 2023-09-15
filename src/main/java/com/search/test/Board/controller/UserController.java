package com.search.test.controller;


import com.search.test.dto.request.BoardCreateRequest;
import com.search.test.dto.request.BoardEditRequest;
import com.search.test.dto.response.BoardCreateResponse;
import com.search.test.dto.response.BoardGetResponse;
import com.search.test.dto.response.BoardSeeResponse;
import com.search.test.service.UserService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    // 게시물 작성
    @PostMapping("/write")
    public ResponseEntity<BoardCreateResponse> writeBoard(@RequestBody BoardCreateRequest boardCreateRequest) {
        return new ResponseEntity<>(userService.boardSave(boardCreateRequest), HttpStatus.CREATED);
    }

    // 게시물 보기
    @GetMapping("/detail/{id}")
    public ResponseEntity<List<BoardSeeResponse>> seeBoard(@PathVariable("id") Long id, BoardSeeResponse boardSeeResponse) {
        return new ResponseEntity<>(HttpStatus.ACCEPTED);

    //게시물 수정
    //@PutMapping("/modify/{id}")


    //게시물 삭제
    //@DeleteMapping("/delate/{id}")


}
