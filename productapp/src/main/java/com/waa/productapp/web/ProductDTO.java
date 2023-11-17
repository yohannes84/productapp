package com.waa.productapp.web;

import com.waa.productapp.domain.Review;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    private String productNumber;
    private String name;
    private Double price;
    private String description;
    private Integer numInStock;
    private List<Review> reviews;
}
