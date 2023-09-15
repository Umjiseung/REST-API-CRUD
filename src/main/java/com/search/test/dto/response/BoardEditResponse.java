package com.search.test.dto.response;

import lombok.Data;

@Data
public class BoardEditResponse {
    private String name;
    private String id;
    private String about;

    public BoardEditResponse(String name, String id, String about) {
        this.name = name;
        this.id = id;
        this.about = about;
    }
}
