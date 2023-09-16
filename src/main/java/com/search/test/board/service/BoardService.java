package com.search.test.board.service;

import com.search.test.board.dto.request.BoardCreateRequest;
import com.search.test.board.dto.request.BoardGetRequest;
import com.search.test.board.dto.request.BoardUpdateRequest;
import com.search.test.board.dto.response.BoardCreateResponse;
import com.search.test.board.dto.response.BoardGetResponse;
import com.search.test.board.dto.response.BoardInfoResponse;
import com.search.test.board.dto.response.BoardUpdateResponse;
import com.search.test.board.entity.Board;
import com.search.test.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class BoardService {


    private final BoardRepository boardRepository;


    @Transactional
    public BoardCreateResponse boardCreate(BoardCreateRequest boardCreateRequest) {
        Board content = new Board();
        content.setId(boardCreateRequest.getId());
        content.setName(boardCreateRequest.getName());
        content.setAbout(boardCreateRequest.getAbout());
        content = boardRepository.save(content);
        BoardCreateResponse boardCreateResponse = new BoardCreateResponse(content.getName(),content.getId(),content.getAbout());
        return boardCreateResponse;
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
        BoardInfoResponse boardInfoResponse = new BoardInfoResponse(board.getId(),board.getName(),board.getAbout());
        return boardInfoResponse;
    }



    @Transactional
    public void boardDelate(Long id) {
        boardRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        boardRepository.deleteById(id);
    }


    @Transactional
    public void boardUpdate(BoardUpdateRequest boardUpdateRequest) {
        Board board = boardRepository.findById(boardUpdateRequest.getId()).orElseThrow(IllegalArgumentException::new);
        board.setName(boardUpdateRequest.getName());
        board.setAbout(boardUpdateRequest.getAbout());
        boardRepository.save(board);
    }



}
