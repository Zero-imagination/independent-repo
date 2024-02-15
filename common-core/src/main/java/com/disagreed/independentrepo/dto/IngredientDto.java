package com.disagreed.independentrepo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IngredientDto {

    private Long ingredientId;

    private String name;

    private BigDecimal price;

    private Long quantity;

    private LocalDate expirationDate;

    private String description;

    private ManufacturerDto manufacturer;
}
