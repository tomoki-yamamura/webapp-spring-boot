package com.example.webapp;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);
	}

	@GetMapping
	public List<Student> hello() {
		return List.of(
			new Student(1L, "Mariam" , "hoge@hoge.com", LocalDate.of(2000, Month.APRIL, 5), 21)
		);
	}
}
