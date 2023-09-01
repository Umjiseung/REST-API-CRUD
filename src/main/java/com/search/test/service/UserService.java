package com.search.test.service;

import com.search.test.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class UserService {


    private UserRepository userRepository;


    public Map<String,String > getText() {
        Map<String,String> map = userRepository.getText();
        return map;
    }

    public List<User> getUser() {
        return userRepository.getUser();
    }

}
