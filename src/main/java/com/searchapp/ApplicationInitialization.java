package com.searchapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@ComponentScan({"com.searchapp.controller", "com.searchapp.dao"})
public class ApplicationInitialization {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationInitialization.class, args);
	}
}
