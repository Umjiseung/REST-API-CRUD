package com.search.test.board.dto.response;

import lombok.Data;

@Data
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
