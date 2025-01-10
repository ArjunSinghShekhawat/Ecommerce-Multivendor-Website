package com.ecommerce.repository;

import com.ecommerce.model.Cart;
import com.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.model.CartItem;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long> {


    CartItem findByCartAndProductAndSize(Cart cart, Product product, String size);


}
