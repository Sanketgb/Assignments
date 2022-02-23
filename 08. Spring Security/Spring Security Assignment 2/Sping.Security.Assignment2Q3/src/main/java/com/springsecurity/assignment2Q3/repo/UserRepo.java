package com.springsecurity.assignment2Q3.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springsecurity.assignment2Q3.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, String> {

    public User findByUsername(String username);
}