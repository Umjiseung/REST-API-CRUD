package com.search.test.doamin.board.dto.request;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor

public class BoardUpdateRequest {

    private String name;

    private Long id;

    private String about;

}
