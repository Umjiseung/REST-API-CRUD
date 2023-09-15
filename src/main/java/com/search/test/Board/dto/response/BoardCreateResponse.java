package com.search.test.Board.dto.response;

import lombok.Data;

@Data
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
