package com.search.test.board.controller;


import com.search.test.board.dto.request.BoardCreateRequest;
import com.search.test.board.dto.request.BoardGetRequest;
import com.search.test.board.dto.request.BoardUpdateRequest;
import com.search.test.board.dto.response.BoardCreateResponse;
import com.search.test.board.dto.response.BoardGetResponse;
import com.search.test.board.dto.response.BoardInfoResponse;
import com.search.test.board.dto.response.BoardUpdateResponse;
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

    private final BoardService boardService;

    // 게시물 작성
    @PostMapping("/write")
    public ResponseEntity<BoardCreateResponse> writeBoard(@RequestBody BoardCreateRequest boardCreateRequest) {
        return new ResponseEntity<>(boardService.boardCreate(boardCreateRequest), HttpStatus.CREATED);
    }

    // 게시물 모두 가져오기
    @GetMapping("/{id}")
    public ResponseEntity<List<BoardGetResponse>> getBoards(@PathVariable("id") BoardGetRequest boardGetRequest) {
        return new ResponseEntity<>(boardService.boardGets(), HttpStatus.OK);
    }

    // 게시물 상세 보기
    @GetMapping("/detail/{id}")
    public ResponseEntity<BoardInfoResponse> getBoard(@PathVariable("id") Long id) {
        return new ResponseEntity<>(boardService.boardGet(id),HttpStatus.OK);
    }


    //게시물 삭제
    @DeleteMapping("/delate/{id}")
    public ResponseEntity<Void> delateBoard(@PathVariable("id") Long id) {
        boardService.boardDelate(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    //게시물 수정
    @PutMapping("/modify/{id}")
    public ResponseEntity<BoardUpdateResponse> updateBoard(@PathVariable("id") @RequestBody BoardUpdateRequest boardUpdateRequest) {
        boardService.boardUpdate(boardUpdateRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}