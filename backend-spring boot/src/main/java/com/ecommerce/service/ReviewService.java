package com.ecommerce.service;

import com.ecommerce.exception.ReviewNotFoundException;
import com.ecommerce.model.Product;
import com.ecommerce.model.Review;
import com.ecommerce.model.User;
import com.ecommerce.request.CreateReviewRequest;

import javax.naming.AuthenticationException;
import java.util.List;

public interface ReviewService {

    Review createReview(CreateReviewRequest req,
                        User user,
                        Product product);

    List<Review> getReviewsByProductId(Long productId);

    Review updateReview(Long reviewId,
                        String reviewText,
                        double rating,
                        Long userId) throws ReviewNotFoundException, AuthenticationException;


    void deleteReview(Long reviewId, Long userId) throws ReviewNotFoundException, AuthenticationException;

}
