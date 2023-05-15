package com.sm.service;

import com.sm.dto.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class UserService {

    public List<User> findAll() {
        User user1 = new User(1L, "Mark", 966512345678L, 30, "mark123", "mark789");
        User user2 = new User(1L, "James", 977512345678L, 30, "jame123", "james789");
        return Stream.of(user1, user2).collect(Collectors.toList());
    }
}
