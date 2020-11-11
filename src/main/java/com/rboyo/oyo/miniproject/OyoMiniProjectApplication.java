package com.rboyo.oyo.miniproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class OyoMiniProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run (OyoMiniProjectApplication.class, args);
	}

}
