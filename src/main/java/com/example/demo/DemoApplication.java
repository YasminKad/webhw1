package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		RestTemplate restTemplate = new RestTemplate();

		String result_division = restTemplate.getForObject("http://localhost:8080/calc/div/24/8", String.class);
		String result_multiplication = restTemplate.getForObject("http://localhost:8080/calc/mult/24/2", String.class);
		String result_summation = restTemplate.getForObject("http://localhost:8080/calc/sum/24/24", String.class);
		String result_subtraction = restTemplate.getForObject("http://localhost:8080/calc/subtract/24/12", String.class);


		System.out.println("Sum: " + result_summation);
		System.out.println("Division: " + result_division);
		System.out.println("Multiplication: " + result_multiplication);
		System.out.println("Subtraction: " + result_subtraction);
	}
}