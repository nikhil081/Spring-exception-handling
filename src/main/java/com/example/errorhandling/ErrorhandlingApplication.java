package com.example.errorhandling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableJpaAuditing
@EnableAutoConfiguration
public class ErrorhandlingApplication {


	public static void main(String[] args) {
		SpringApplication.run(ErrorhandlingApplication.class, args);
	}
}
