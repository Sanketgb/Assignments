package com.springsecurity.assignmentQ5.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springsecurity.assignmentQ5.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, String> {

    public User findByUsername(String username);
}