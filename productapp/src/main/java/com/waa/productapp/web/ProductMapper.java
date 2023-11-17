package com.waa.productapp.web;

import com.waa.productapp.domain.Product;

public class ProductMapper {
    public static Product getProduct(ProductDTO productDTO){

        return Product.builder()
                .productNumber(productDTO.getProductNumber())
                .name(productDTO.getName())
                .description(productDTO.getDescription())
                .price(productDTO.getPrice())
                .numInStock(productDTO.getNumInStock())
                .reviews(productDTO.getReviews())
                .build();
    }

    public static ProductDTO getProductDTO(Product product){

        return ProductDTO.builder()
                .productNumber(product.getProductNumber())
                .name(product.getDescription())
                .description(product.getDescription())
                .numInStock(product.getNumInStock())
                .reviews(product.getReviews())
                .price(product.getPrice())
                .build();
    }
}
