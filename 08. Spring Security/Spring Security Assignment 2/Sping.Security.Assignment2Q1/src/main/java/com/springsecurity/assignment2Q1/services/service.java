package com.springsecurity.assignment2Q1.services;

import java.util.List;

import com.springsecurity.assignment2Q1.entities.User;


public interface service {

    public List<User> getAllUsers();

    public User getUser(String username);

    public User addUser(User user);
}
