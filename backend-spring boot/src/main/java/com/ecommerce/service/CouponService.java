package com.ecommerce.service;

import com.ecommerce.exception.CouponNotValidException;
import com.ecommerce.model.Cart;
import com.ecommerce.model.Coupon;
import com.ecommerce.model.User;

import java.util.List;

public interface CouponService {
    Cart applyCoupon(String code, double orderValue, User user) throws Exception;
    Cart removeCoupon(String code, User user) throws Exception;
    Coupon createCoupon(Coupon coupon);
    void deleteCoupon(Long couponId);
    List<Coupon> getAllCoupons();
    
    Coupon getCouponById(Long couponId) throws CouponNotValidException;
}
