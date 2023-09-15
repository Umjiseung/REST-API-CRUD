package com.search.test.dto.response;

import lombok.Data;

@Data
public class BoardSeeResponse {
    private String id;
    private String name;
    private String about;

    public BoardSeeResponse(String id,String name,String about) {
        this.id = id;
        this.name = name;
        this.about = about;
    }
}
