package com.search.test.board.dto.response;

import lombok.Data;

@Data
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
