package com.jenk.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestJenkinsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TestJenkinsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("!!budbudabulabuw");
	}
}
