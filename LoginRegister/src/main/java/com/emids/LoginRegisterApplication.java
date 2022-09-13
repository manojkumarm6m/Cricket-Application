package com.emids;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.emids.service.UserService;
import com.emids.web.Temp;

@SpringBootApplication
public class LoginRegisterApplication {
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(LoginRegisterApplication.class, args);
	}
	
	

}
