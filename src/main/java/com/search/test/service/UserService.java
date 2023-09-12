package com.search.test.service;

import com.search.test.entity.User;
import com.search.test.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;


@Service
@RequiredArgsConstructor
public class UserService {


    private UserRepository userRepository;

    public Map<String,String> getMessage() {
        Map<String,String> map = userRepository.getMessage();
        return map;
    }

    public List<User> getUser() {
        return userRepository.getUser();
    }

}
