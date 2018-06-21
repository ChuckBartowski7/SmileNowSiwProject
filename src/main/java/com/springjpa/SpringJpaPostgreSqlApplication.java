package com.springjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springjpa.repo.UserRepository;

@SpringBootApplication
public class SpringJpaPostgreSqlApplication {

	@Autowired
	UserRepository repository;
	
	public static void main(String[] args){
		SpringApplication.run(SpringJpaPostgreSqlApplication.class, args);
	}

	
}
