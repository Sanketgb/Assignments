package com.springsecurity.assignment2Q1.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springsecurity.assignment2Q1.entities.User;

@Service
public class serviceImpl implements service {

    List<User> list = new ArrayList<>();

    public serviceImpl() {
        list.add(new User("Sanket", "123", "sanketbolamwar@gmail.com"));
    }

    // Get All Users
    public List<User> getAllUsers() {
        return this.list;
    }

    // Get Users By Username
    public User getUser(String username) {
        return this.list.stream().filter((user) -> user.getUsername().equals(username)).findAny().orElse(null);
    }

    // To set users
    public User addUser(User user) {
        this.list.add(user);
        return user;
    }
}
