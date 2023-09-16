package com.search.test.Board.dto.Board.request;

import lombok.Data;

@Data
public class BoardCreateRequest {
    private String id;
    private String name;
    private String about;
}
