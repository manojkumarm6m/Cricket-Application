package com.emids.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.server.ui.LoginPageGeneratingWebFilter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emids.model.LoginDto;
import com.emids.model.User;
import com.emids.repository.RoleRepository;
import com.emids.repository.UserRepository;
import com.emids.service.UserService;
import com.emids.web.dto.UserRegistrationDto;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "http://localhost:3000",allowedHeaders = "*")
@RestController
@RequestMapping("/api/auth")
@Slf4j
public class LogReg {
	
	@Autowired
	private UserRepository repo;
	
	@Autowired
    private AuthenticationManager authenticationManager;
	
	
	 @PostMapping("/signin")
	    public ResponseEntity<LoginDto> authenticateUser(@RequestBody LoginDto loginDto) throws UsernameNotFoundException{
	     if(loginDto == null) {
	    	 throw new UsernameNotFoundException("Player login not found");
	    	 
	     }
		 Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
	                loginDto.getUsernameOrEmail(), loginDto.getPassword()));

	        SecurityContextHolder.getContext().setAuthentication(authentication);
	        log.info("inside post inside sign in");

	    	
	        return new ResponseEntity<LoginDto>(loginDto, HttpStatus.OK);
	    }
	 
	 @GetMapping("/getname")
	 public ResponseEntity<User> getname() {
		 LoginDto dto = new LoginDto();
		 User userdto = repo.findByEmail(dto.getUsernameOrEmail());
		 return new ResponseEntity<User>(userdto,HttpStatus.OK);
	 }
}
