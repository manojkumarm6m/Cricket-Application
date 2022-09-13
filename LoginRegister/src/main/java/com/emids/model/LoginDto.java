package com.emids.model;

//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

//import com.emids.web.dto.UserRegistrationDto;

import lombok.Data;

@Data
public class LoginDto {
	
	
	private String token = "ncksfhesdisda";
    private String usernameOrEmail;
    private String password;
}