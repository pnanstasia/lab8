package ua.edu.ucu.lab7_4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Lab74Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab74Application.class, args);
	}
}
