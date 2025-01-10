package com.ecommerce.service;

import com.ecommerce.exception.SellerException;
import com.ecommerce.exception.UserException;
import com.ecommerce.request.LoginRequest;
import com.ecommerce.request.SignupRequest;
import com.ecommerce.response.AuthResponse;
import jakarta.mail.MessagingException;

public interface AuthService {

    void sentLoginOtp(String email) throws UserException, MessagingException;

    String createUser(SignupRequest req) throws SellerException;

    AuthResponse signin(LoginRequest req) throws SellerException;

}
