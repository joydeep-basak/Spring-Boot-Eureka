package com.example.springbootswagger2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

@EnableDiscoveryClient
@SpringBootApplication
@Configuration
public class SpringBootSwagger2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSwagger2Application.class, args);
	}
}
