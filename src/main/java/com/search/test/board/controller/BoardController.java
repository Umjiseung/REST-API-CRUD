package com.search.test.board.controller;


import com.search.test.board.dto.request.BoardCreateRequest;
import com.search.test.board.dto.request.BoardGetRequest;
import com.search.test.board.dto.response.BoardCreateResponse;
import com.search.test.board.dto.response.BoardGetResponse;
import com.search.test.board.dto.response.BoardInfoResponse;
import com.search.test.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class BoardController {

    private final BoardService userService;

    // 게시물 작성
    @PostMapping("/write")
    public ResponseEntity<BoardCreateResponse> writeBoard(@RequestBody BoardCreateRequest boardCreateRequest) {
        return new ResponseEntity<>(userService.boardCreate(boardCreateRequest), HttpStatus.CREATED);
    }

    // 게시물 보기
    @GetMapping("/{id}")
    public ResponseEntity<List<BoardGetResponse>> getBoards(@PathVariable("id") BoardGetRequest boardGetRequest) {
        return new ResponseEntity<>(userService.boardGets(), HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<BoardInfoResponse> getBoard(@PathVariable("id") Long id) {
        return new ResponseEntity<>(userService.boardGet(id),HttpStatus.OK);
    }


    //게시물 삭제
    @DeleteMapping("/delate/{id}")
    public ResponseEntity<Void> delateBoard(@PathVariable("id") Long id) {
        userService.boardDelate(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    //게시물 수정
    //@PutMapping("/modify/{id}")

}