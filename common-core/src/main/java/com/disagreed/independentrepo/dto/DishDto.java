package com.disagreed.independentrepo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DishDto {

    private Long dishId;

    private String name;

    private BigDecimal price;

    private String description;

    private String image;

    private QualificationDto qualification;

    private List<IngredientDto> ingredientList;
}
