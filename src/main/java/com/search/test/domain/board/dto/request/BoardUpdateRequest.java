package com.search.test.domain.board.dto.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor

public class BoardUpdateRequest {

    private String name;

    private Long id;

    private String about;

}
