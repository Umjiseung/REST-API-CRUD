package com.search.test.dto.request;

import com.search.test.entity.User;
import lombok.Data;

@Data
public class BoardCreateRequest {
    private String id;
    private String name;
    private String about;


}
