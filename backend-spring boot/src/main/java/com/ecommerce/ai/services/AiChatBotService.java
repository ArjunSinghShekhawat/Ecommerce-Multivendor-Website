package com.ecommerce.ai.services;

import com.ecommerce.exception.ProductException;
import com.ecommerce.response.ApiResponse;

public interface AiChatBotService {

    ApiResponse aiChatBot(String prompt,Long productId,Long userId) throws ProductException;
}
