package com.search.test.domain.board.controller;


import com.search.test.domain.board.dto.request.BoardCreateRequest;
import com.search.test.domain.board.dto.request.BoardUpdateRequest;
import com.search.test.domain.board.dto.response.BoardCreateResponse;
import com.search.test.domain.board.dto.response.BoardGetResponse;
import com.search.test.domain.board.dto.response.BoardInfoResponse;
import com.search.test.domain.board.dto.response.BoardUpdateResponse;
import com.search.test.domain.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;



    // 게시물 작성
    @PostMapping("/write")
    public ResponseEntity<BoardCreateResponse> writeBoard(@RequestBody BoardCreateRequest boardCreateRequest) {
        return new ResponseEntity<>(boardService.boardCreate(boardCreateRequest), HttpStatus.CREATED);
    }

    // 게시물 모두 가져오기
    @GetMapping
    public ResponseEntity<List<BoardGetResponse>> getBoards() {
        return new ResponseEntity<>(boardService.boardGets(), HttpStatus.OK);
    }

    // 게시물 상세 보기
    @GetMapping("/detail/{id}")
    public ResponseEntity<BoardInfoResponse> getBoard(@PathVariable("id") Long id) {
        return new ResponseEntity<>(boardService.boardGet(id),HttpStatus.OK);
    }


    //게시물 삭제
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteBoard(@PathVariable("id") Long id) {
        boardService.boardDelete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    //게시물 수정
    @PutMapping("/modify")
    public ResponseEntity<BoardUpdateResponse> updateBoard(@RequestBody BoardUpdateRequest boardUpdateRequest) {
        boardService.boardUpdate(boardUpdateRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}