package com.disagreed.independentrepo.api;

import com.disagreed.independentrepo.model.entity.DishEntity;

import java.util.List;

public interface DishService {

    List<DishEntity> getAll();

    DishEntity getByDishId(Long dishId);
}
