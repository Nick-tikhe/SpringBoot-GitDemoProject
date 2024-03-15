package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootGitDemoApplication {
	
	@PostMapping("/product")
	public String createProduct(@RequestBody Order order) {
		return "Hi "+order.getUsername()+" product name  "+order.getProductName()+" product amount"+order.getAmount();
	}
	@GetMapping("/getHi")
	public String justTP(){
	return "Hi Nick";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootGitDemoApplication.class, args);
	}

}
