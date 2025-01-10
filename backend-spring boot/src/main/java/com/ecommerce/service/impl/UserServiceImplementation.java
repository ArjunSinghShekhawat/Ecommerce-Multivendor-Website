package com.ecommerce.service.impl;


import com.ecommerce.exception.UserException;
import com.ecommerce.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ecommerce.config.JwtProvider;
import com.ecommerce.model.User;
import com.ecommerce.repository.PasswordResetTokenRepository;
import com.ecommerce.repository.UserRepository;

@Service
@RequiredArgsConstructor

public class UserServiceImplementation implements UserService {


	private final UserRepository userRepository;
	private final JwtProvider jwtProvider;
	private final PasswordEncoder passwordEncoder;
	private final PasswordResetTokenRepository passwordResetTokenRepository;
	private final JavaMailSender javaMailSender;

	@Override
	public User findUserProfileByJwt(String jwt) throws UserException {
		String email=jwtProvider.getEmailFromJwtToken(jwt);
		
		
		User user = userRepository.findByEmail(email);
		
		if(user==null) {
			throw new UserException("user not exist with email "+email);
		}
		return user;
	}



	
	@Override
	public User findUserByEmail(String username) throws UserException {
		
		User user=userRepository.findByEmail(username);
		
		if(user!=null) {
			
			return user;
		}
		
		throw new UserException("user not exist with username "+username);
	}



}
