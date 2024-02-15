package com.disagreed.independentrepo.api;

import com.disagreed.independentrepo.dto.DishDto;

import java.util.List;

public interface DishService {

    List<DishDto> getAll(Long typeCode);

    DishDto getByDishId(Long dishId, Long typeCode);
}
