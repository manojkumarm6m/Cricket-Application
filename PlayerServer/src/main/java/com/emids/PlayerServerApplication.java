package com.emids;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PlayerServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayerServerApplication.class, args);
	}

}
