package com.disagreed.independentrepo.api;

import com.disagreed.independentrepo.dto.RestaurantDto;

import java.util.List;

public interface RestaurantService {

    List<RestaurantDto> getAll();

    RestaurantDto getByRestaurantId(Long restaurantId);
}