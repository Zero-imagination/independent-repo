package com.disagreed.independentrepo.repository.api;

import com.disagreed.independentrepo.model.entity.DishEntity;

import java.util.List;
import java.util.Optional;

public interface IndependentDishRepository {

    List<DishEntity> getAll();

    Optional<DishEntity> getByDishId(Long dishId);
}
