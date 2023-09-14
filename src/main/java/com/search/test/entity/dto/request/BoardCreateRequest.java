package com.search.test.entity.dto.request;

import lombok.Data;

@Data
public class BoardCreateRequest {
    private String id;
    private String name;
    private String about;
}
