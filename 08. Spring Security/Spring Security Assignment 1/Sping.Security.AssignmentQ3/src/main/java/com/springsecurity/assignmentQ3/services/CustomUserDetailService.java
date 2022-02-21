package com.springsecurity.assignmentQ3.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springsecurity.assignmentQ3.entities.CustomUserDetail;
import com.springsecurity.assignmentQ3.entities.User;
import com.springsecurity.assignmentQ3.repo.UserRepo;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = this.userRepo.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("INVALID USERNAME!!");
        }
        
        return new CustomUserDetail(user);
    }
}