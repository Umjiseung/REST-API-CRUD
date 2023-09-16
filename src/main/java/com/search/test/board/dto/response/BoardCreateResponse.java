package com.search.test.board.dto.response;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Builder
public class BoardCreateResponse {

    private String name;
    private String id;
    private String about;

    public BoardCreateResponse(String name, String id, String about) {
        this.name = name;
        this.id = id;
        this.about = about;
    }

}
