package com.search.test.repository;


import org.apache.catalina.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class UserRepository {

    private static List<User> users;

    public Map<String, String> getText() {

    }

    public List<User> getUser() {

        return this.users;
    }

}
