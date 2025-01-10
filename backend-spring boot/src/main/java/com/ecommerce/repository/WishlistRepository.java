package com.ecommerce.repository;

import com.ecommerce.model.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishlistRepository extends JpaRepository<Wishlist, Long> {
    Wishlist findByUserId(Long userId);
}
