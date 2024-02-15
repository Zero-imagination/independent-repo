package com.disagreed.independentrepo.dto;

import com.disagreed.independentrepo.model.entity.CategoryEntity;
import com.disagreed.independentrepo.model.entity.DishEntity;
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

    private CategoryEntity category;

    private List<DishEntity> dishList;
}
