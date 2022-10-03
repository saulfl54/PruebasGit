package com.pruebagit.web.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PurebaGitApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PurebaGitApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Hola");
		
	}

}
