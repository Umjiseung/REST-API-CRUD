package com.search.test.board.dto.response;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Builder
public class BoardInfoResponse {
    private String id;
    private String name;
    private String about;


    public BoardInfoResponse(String id, String name, String about) {
        this.id = id;
        this.name = name;
        this.about = about;
    }
}
