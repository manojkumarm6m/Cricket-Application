package com.emids.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.emids.model.User;
import com.emids.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{

	User save(UserRegistrationDto dto); 
	
//	public void sendEmail(String toEmail,
//			String subject,
//			String body);
}
