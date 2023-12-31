package com.search.test.domain.board.service;

import com.search.test.domain.board.dto.request.BoardCreateRequest;
import com.search.test.domain.board.dto.request.BoardUpdateRequest;
import com.search.test.domain.board.dto.response.BoardCreateResponse;
import com.search.test.domain.board.dto.response.BoardGetResponse;
import com.search.test.domain.board.dto.response.BoardInfoResponse;
import com.search.test.domain.board.entity.Board;
import com.search.test.domain.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class BoardService {


    private final BoardRepository boardRepository;


    @Transactional
    public BoardCreateResponse boardCreate(BoardCreateRequest boardCreateRequest) {
        if (boardCreateRequest.getName().isBlank() || boardCreateRequest.getAbout().isBlank()) throw new IllegalArgumentException("작성되지 않아 예외가 발생했습니다.");
        Board content = new Board();
        content.setId(boardCreateRequest.getId());
        content.setName(boardCreateRequest.getName());
        content.setAbout(boardCreateRequest.getAbout());
        content = boardRepository.save(content);
        return new BoardCreateResponse(content.getId(),content.getName(),content.getAbout());
    }

    @Transactional(readOnly = true)
    public List<BoardGetResponse> boardGets() {
        List<Board> boards = boardRepository.findAll();
        List<BoardGetResponse> boardGetResponses = new ArrayList<>();

        for (Board board : boards) {
            boardGetResponses.add(new BoardGetResponse(board.getId(), board.getName(), board.getAbout()));
        }
        return boardGetResponses;
    }


    @Transactional(readOnly = true)
    public BoardInfoResponse boardGet(Long id) {
        Board board = boardRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        return new BoardInfoResponse(board.getId(),board.getName(),board.getAbout());
    }


    @Transactional
    public void boardDelete(Long id) {
        Board board = boardRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        boardRepository.delete(board);
    }



    @Transactional 
    public void boardUpdate(BoardUpdateRequest boardUpdateRequest, Long id) {
        Board board = boardRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        board.setName(boardUpdateRequest.getName());
        board.setAbout(boardUpdateRequest.getAbout());
        boardRepository.save(board);
    }



}
