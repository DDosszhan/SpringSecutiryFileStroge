package com.example.SpringSecurityFileStorage;

import com.example.SpringSecurityFileStorage.Entity.Role;
import com.example.SpringSecurityFileStorage.Entity.User;
import com.example.SpringSecurityFileStorage.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringSecurityFileStorageApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;


	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityFileStorageApplication.class, args);
	}

	public void run(String... args) throws Exception {
		User admin = userRepository.findByRole(Role.ADMIN);

		if(admin == null) {
			User user = new User();
			user.setEmail("admin@gmail.com");
			user.setFirstName("admin");
			user.setLastName("admin");
			user.setRole(Role.ADMIN);
			user.setPassword(new BCryptPasswordEncoder().encode("admin"));
			userRepository.save(user);

		}
	}
}
