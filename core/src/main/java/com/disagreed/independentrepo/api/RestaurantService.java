package com.disagreed.independentrepo.api;

import com.disagreed.independentrepo.model.entity.RestaurantEntity;

import java.util.List;

public interface RestaurantService {

    List<RestaurantEntity> getAll();

    RestaurantEntity getByRestaurantId(Long restaurantId);
}