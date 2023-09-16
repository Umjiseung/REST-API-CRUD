package com.search.test.board.dto.response;

import lombok.Builder;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Builder
public class BoardUpdateResponse {
    private String name;
    private String id;
    private String about;

    public BoardUpdateResponse(String name, String id, String about) {
        this.name = name;
        this.id = id;
        this.about = about;
    }
}
