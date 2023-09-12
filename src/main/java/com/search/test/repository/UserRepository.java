package com.search.test.repository;


import com.search.test.entity.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepository{

    public static List<User> user;

    public Map<String,String> getMessage() {
        Map<String,String> map = new HashMap<>();
        return map;
    }

    public List<User> getUser() {
        return this.user;
    }
}
