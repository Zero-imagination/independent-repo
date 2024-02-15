package com.disagreed.independentrepo.api;

import com.disagreed.independentrepo.dto.RestaurantDto;

import java.util.List;

public interface RestaurantService {

    List<RestaurantDto> getAll(Long typeCode);

    RestaurantDto getByRestaurantId(Long restaurantId, Long typeCode);
}