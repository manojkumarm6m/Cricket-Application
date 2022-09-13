package com.emids;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PlayerStatApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayerStatApplication.class, args);
	}

}
