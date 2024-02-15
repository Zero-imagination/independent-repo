package com.disagreed.independentrepo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuDto {

    private Long menuId;

    private String name;

    private String description;

    private CategoryDto category;

    private List<DishDto> dishList;
}
