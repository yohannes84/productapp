package com.waa.productapp.web;

import com.waa.productapp.domain.Review;

public class ReviewMapper {

    public static ReviewDTO mapToDTO(Review review) {
        return ReviewDTO.builder()
                .name(review.getName())
                .rating(review.getRating())
                .comment(review.getComment())
                .build();
    }

    public static Review mapToEntity(ReviewDTO reviewDTO) {
        return Review.builder()
                .name(reviewDTO.getName())
                .rating(reviewDTO.getRating())
                .comment(reviewDTO.getComment())
                .build();
    }
}
