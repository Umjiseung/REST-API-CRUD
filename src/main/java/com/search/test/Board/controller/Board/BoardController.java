package com.search.test.Board.controller.Board;


import com.search.test.Board.dto.Board.request.BoardCreateRequest;
import com.search.test.Board.dto.Board.request.BoardGetRequest;
import com.search.test.Board.dto.Board.response.BoardCreateResponse;
import com.search.test.Board.dto.Board.response.BoardGetResponse;
import com.search.test.Board.service.Board.BoardService;
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
    @GetMapping("/detail/{id}")
    public ResponseEntity<List<BoardGetResponse>> getBoard(@PathVariable("id") BoardGetRequest boardGetRequest) {
        return new ResponseEntity<>(userService.boardGet(), HttpStatus.OK);
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