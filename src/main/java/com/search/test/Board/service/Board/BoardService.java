package com.search.test.Board.service.Board;

import com.search.test.Board.dto.Board.request.BoardCreateRequest;
import com.search.test.Board.dto.Board.response.BoardCreateResponse;
import com.search.test.Board.dto.Board.response.BoardGetResponse;
import com.search.test.Board.dto.Board.response.BoardInfoResponse;
import com.search.test.Board.entity.Board.Board;
import com.search.test.Board.repository.Board.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        BoardCreateResponse boardCreateResponse = new BoardCreateResponse(content.getId(),content.getName(),content.getAbout());
        return boardCreateResponse;
    }

    @Transactional(readOnly = true)
    public List<BoardGetResponse> boardGets() {
        return boardRepository.findAll().stream()
                .map(b -> new BoardGetResponse(b.getId(), b.getName(), b.getAbout()))
                .collect(Collectors.toList());
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




}
