package com.ecommerce.service;

import com.ecommerce.model.VerificationCode;

public interface VerificationService {

    VerificationCode createVerificationCode(String otp, String email);
}
