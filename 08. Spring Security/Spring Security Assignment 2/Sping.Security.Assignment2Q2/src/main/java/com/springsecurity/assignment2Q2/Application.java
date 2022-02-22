package com.springsecurity.assignment2Q2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.springsecurity.assignment2Q2.entities.User;
import com.springsecurity.assignment2Q2.repo.UserRepo;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User user1 = new User();
		user1.setEmail("sanketbolamwar@gmail.com");
		user1.setUsername("Sanket");
		user1.setPassword(bCryptPasswordEncoder.encode("12345"));
		user1.setRole("ADMIN");

		userRepo.save(user1);

		User user2 = new User();
		user2.setEmail("radhasharma@gmail.com");
		user2.setUsername("Radha");
		user2.setPassword(bCryptPasswordEncoder.encode("123"));
		user2.setRole("USER");

		userRepo.save(user2);
	}

}
