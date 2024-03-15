package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootGitDemoApplication {
	
	@PostMapping("/product/{userName}/{amount}/{productName}")
	public String createProduct(@PathVariable String userName,@PathVariable double amount,@PathVariable String productName) {
		return "user name is "+userName+" product name  "+productName+" product amount"+amount;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGitDemoApplication.class, args);
	}

}
