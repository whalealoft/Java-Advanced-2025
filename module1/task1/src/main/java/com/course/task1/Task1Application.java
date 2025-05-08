package com.course.task1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Task1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Task1Application.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("hello world");
	}
}
