package com.example.errorhandling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ErrorhandlingApplication {


	public static void main(String[] args) {
		SpringApplication.run(ErrorhandlingApplication.class, args);
	}
}
