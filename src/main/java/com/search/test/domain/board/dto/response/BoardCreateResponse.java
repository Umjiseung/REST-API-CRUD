package com.search.test.domain.board.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Builder
public class BoardCreateResponse {

    private Long id;
    private String name;
    private String about;

    public BoardCreateResponse(Long id,String name, String about) {
        this.id = id;
        this.name = name;
        this.about = about;
    }

}
