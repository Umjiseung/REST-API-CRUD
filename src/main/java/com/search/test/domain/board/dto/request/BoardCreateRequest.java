package com.search.test.domain.board.dto.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BoardCreateRequest {
    private Long id;

    private String name;

    private String about;
}
