package com.disagreed.independentrepo.api;

import com.disagreed.independentrepo.model.entity.IngredientEntity;

import java.util.List;

public interface IngredientService {

    List<IngredientEntity> getAll();

    IngredientEntity getByIngredientId(Long ingredientId);

}