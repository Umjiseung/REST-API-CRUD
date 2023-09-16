package com.search.test.board.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Builder
public class BoardCreateRequest {
    private Long id;

    private String name;

    private String about;
}
