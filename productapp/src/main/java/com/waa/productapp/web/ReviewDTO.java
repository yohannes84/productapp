package com.waa.productapp.web;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReviewDTO {
    @NotNull(message = "Reviewer name cannot be blank")
    private String name;
    @Min(value = 1, message = "Rating must be at least 1")
    @Max(value = 5, message = "Rating cannot be more than 5")
    @NotNull(message = "Rating cannot be blank")
    private Double rating;
    @NotNull(message = "Comment cannot be blank")
    private String comment;
    @NotNull(message = "Review date cannot be null")
    @PastOrPresent(message = "Review date must be in the past or present")
    private LocalDateTime reviewDate;;
}
