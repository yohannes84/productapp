package com.waa.productapp.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.jmx.export.annotation.ManagedAttribute;

import javax.validation.constraints.*;
import java.util.List;

@Document
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @Size(min =4, max = 12)
    @NotNull(message = "Product Number cannot be blank")
    private String productNumber;
    @NotNull(message = "Name cannot be blank")
    @Size(min =  2, max =  30)
    private String name;
    @Positive(message = "Price must be a positive number")
    @NotNull(message = "Price cannot be blank")
    private Double price;
    @Size(min = 10, max = 500, message = "Description must be between 10 and 500 characters")
    private String description;
    @Min(value = 0, message = "Number in stock cannot be negative")
    private Integer numInStock;
    private List<Review> reviews;
}
