package com.search.test.doamin.board.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BoardCreateRequest {
    private Long id;

    private String name;

    private String about;
}