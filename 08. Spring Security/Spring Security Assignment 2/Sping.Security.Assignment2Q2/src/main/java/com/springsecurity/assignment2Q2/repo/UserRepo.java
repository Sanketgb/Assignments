package com.springsecurity.assignment2Q2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springsecurity.assignment2Q2.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, String> {

    public User findByUsername(String username);
}