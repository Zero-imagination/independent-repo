package com.disagreed.independentrepo.api;

import com.disagreed.independentrepo.dto.IngredientDto;

import java.util.List;

public interface IngredientService {

    List<IngredientDto> getAll();

    IngredientDto getByIngredientId(Long ingredientId);

}