package com.search.test.doamin.board.dto.response;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Builder
public class BoardGetResponse {
    private Long id;
    private String name;
    private String about;


    public BoardGetResponse(Long id, String name, String about) {
        this.id = id;
        this.name = name;
        this.about = about;
    }
}