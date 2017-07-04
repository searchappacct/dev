package com.searchapp.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
@EnableAutoConfiguration
@Configuration
public class ApplicationInitialization {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationInitialization.class, args);
	}
}
