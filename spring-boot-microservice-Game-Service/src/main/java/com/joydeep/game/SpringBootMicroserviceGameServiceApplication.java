package com.joydeep.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableDiscoveryClient
@Configuration
@ComponentScan("com.joydeep")
public class SpringBootMicroserviceGameServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroserviceGameServiceApplication.class, args);
	}
}
