package com.ecommerce.response;

import com.ecommerce.dto.OrderHistory;
import com.ecommerce.model.Cart;
import com.ecommerce.model.Product;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FunctionResponse {
    private String functionName;
    private Cart userCart;
    private OrderHistory orderHistory;
    private Product product;
}
