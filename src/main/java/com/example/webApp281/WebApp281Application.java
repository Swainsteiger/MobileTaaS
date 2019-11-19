package com.example.webApp281;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class WebApp281Application {

	public static void main(String[] args) {
		SpringApplication.run(WebApp281Application.class, args);
	}

}
