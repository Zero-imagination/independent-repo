package com.disagreed.independentrepo.repository.api;

import com.disagreed.independentrepo.model.entity.RestaurantEntity;

import java.util.List;
import java.util.Optional;

public interface IndependentRestaurantRepository {

    List<RestaurantEntity> getAll();

    Optional<RestaurantEntity> getByRestaurantId(Long restaurantId);
}