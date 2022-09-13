package com.emids.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.emids.model.Role;
import com.emids.model.User;
import com.emids.repository.UserRepository;
import com.emids.web.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService{
	
//	@Autowired
//	private JavaMailSender mailSender;
//	
//	@Override
//	public void sendEmail(String toEmail,
//			String subject,
//			String body) {
//		SimpleMailMessage message = new SimpleMailMessage();
//		
//		message.setFrom("jagadeeshone2@gmail.com");
//		message.setTo(toEmail);
//		message.setText(body);
//		message.setSubject(subject);
//		mailSender.send(message);
//		System.out.println("mail sent successfully");
//	}

	@Autowired
	private UserRepository repo;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public User save(UserRegistrationDto dto) {
		User user = new User(dto.getFirstName(),
				dto.getLastName(), 
				dto.getEmail(),
				passwordEncoder.encode( dto.getPassword())
				,Arrays.asList(new Role("ROLE_USER")));
		return repo.save(user);
	}

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = repo.findByEmail(email);
		if(user == null) {
			throw new UsernameNotFoundException("Invalid UserName or Password");
		}
		return new org.springframework.security.core.userdetails.
				User(user.getEmail(),user.getPassword(),mapRolesToAuthorities(user.getRoles()));
	}

	private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
		return roles.stream()
		.map(role -> new SimpleGrantedAuthority(role.getName()))
		.collect(Collectors.toList());
	}







}
