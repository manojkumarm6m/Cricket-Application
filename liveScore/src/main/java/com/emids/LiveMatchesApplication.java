package com.emids;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LiveMatchesApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiveMatchesApplication.class, args);
	}

}
