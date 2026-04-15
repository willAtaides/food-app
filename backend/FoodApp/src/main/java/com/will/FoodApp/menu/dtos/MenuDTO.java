package com.will.FoodApp.menu.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.will.FoodApp.category.entity.Category;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.math.BigDecimal;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MenuDTO {

    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    private String description;
    @NotBlank(message = "Price is required")
    @Positive(message = "Price must be positive")
    private BigDecimal price;

    private String imageUrl;

    @NotNull(message = "Category ID is required")
    private Long categoryId; // needed when adding a menu

    private MultpartFile imageFile; //For uploading the image

    private List<ReviewDTO> reviews;
}
