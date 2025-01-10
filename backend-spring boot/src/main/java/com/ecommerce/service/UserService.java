package com.ecommerce.service;

import com.ecommerce.exception.UserException;
import com.ecommerce.model.User;

public interface UserService {

	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public User findUserByEmail(String email) throws UserException;


}
