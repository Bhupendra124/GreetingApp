package com.bridgelabz.GreetingApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetingAppApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to this Greeting App By Bhupendra");
		SpringApplication.run(GreetingAppApplication.class, args);
	}

}
