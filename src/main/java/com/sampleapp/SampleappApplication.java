package com.sampleapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleappApplication {



	public static void main(String[] args) {
		SpringApplication.run(SampleappApplication.class, args);
	}

	@GetMapping("/")
	public String getHello(){
		return "Hello welcome to CI/CD world!";
	}

}
