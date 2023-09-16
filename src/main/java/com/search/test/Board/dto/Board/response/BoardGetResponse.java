package com.search.test.Board.dto.Board.response;

import lombok.Data;

@Data
public class BoardGetResponse {
    private String id;
    private String name;
    private String about;

    public BoardGetResponse(String id, String name, String about) {
        this.id = id;
        this.name = name;
        this.about = about;
    }
}
