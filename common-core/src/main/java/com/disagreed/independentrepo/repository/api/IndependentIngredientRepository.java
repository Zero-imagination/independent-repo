package com.disagreed.independentrepo.repository.api;

import com.disagreed.independentrepo.model.entity.IngredientEntity;

import java.util.List;
import java.util.Optional;

public interface IndependentIngredientRepository {

    List<IngredientEntity> getAll();

    Optional<IngredientEntity> getByIngredientId(Long ingredientId);
}
