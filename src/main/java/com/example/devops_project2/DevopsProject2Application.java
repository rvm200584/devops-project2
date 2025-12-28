package com.example.devops_project2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DevopsProject2Application {

	public static void main(String[] args) {
		SpringApplication.run(DevopsProject2Application.class, args);
	}
	@GetMapping("/")
	public String home() {
	return "<h1>Welcome TCS DevOps Architect</h1>";
	}	

}
