package com.emids.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emids.model.User;
import com.emids.repository.UserRepository;
import com.emids.service.UserService;
import com.emids.web.dto.UserRegistrationDto;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@Slf4j
@RequestMapping("/api/auth")
public class UserRegisterController {
	
	@Autowired
	private UserRepository repo;

	@Autowired
	private UserService service;
	
//	@ModelAttribute("user")
//	public UserRegistrationDto registrationDto() {
//		return new UserRegistrationDto();
//	}
	
//	@GetMapping
//	public String showRegistrationForm() {
//		return "registration";
//	}
	String mail="";
	@PostMapping("/register")
	public ResponseEntity<String> registerUserAccount(@RequestBody UserRegistrationDto dto) {
		service.save(dto);
		this.mail = dto.getEmail();
//		Temp temp = new Temp();
//		temp.setEmail(dto.getEmail());
		log.info("inside register inside post");
		return new ResponseEntity<>("registration successfully",HttpStatus.OK);
	}
	@GetMapping("/name/{n}")
	public User name(@PathVariable("n") String email) {
//		Temp temp = new Temp();
		User u = repo.findByEmail(email);
		return u;
	}
	
	
	
//	@EventListener(ApplicationReadyEvent.class)
//	public void sendmail(String mail) {
//		this.mail = mail;
//		service.sendEmail((String)mail, "Cricket Player App", 
//				"<h1>Welcome to the cricket player app</h1><br/>"
//				+ "Thanks for registering");
//	}
	
}
