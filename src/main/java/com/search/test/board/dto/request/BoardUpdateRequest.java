package com.search.test.board.dto.request;

import lombok.Data;

@Data
public class BoardUpdateRequest {
    private String name;
    private String id;
    private String about;

}
