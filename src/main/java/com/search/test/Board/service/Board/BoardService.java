package com.search.test.Board.service.Board;

import com.search.test.Board.dto.Board.request.BoardCreateRequest;
import com.search.test.Board.dto.Board.response.BoardCreateResponse;
import com.search.test.Board.dto.Board.response.BoardGetResponse;
import com.search.test.Board.entity.Board.Board;
import com.search.test.Board.repository.Board.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


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

    @Transactional
    public List<BoardGetResponse> boardGets() {

    }


    @Transactional(readOnly = true)
    public List<BoardGetResponse> boardGet() {

    }



    @Transactional
    public void boardDelate(Long id) {
        boardRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        boardRepository.deleteById(id);
    }

}
