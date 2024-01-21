package com.example.Thekra;

import com.example.Thekra.user.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class ThekraApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThekraApplication.class, args);
	}

}
