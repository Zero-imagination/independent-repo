package com.disagreed.independentrepo.service;

import com.disagreed.independentrepo.api.RestaurantService;
import com.disagreed.independentrepo.dto.RestaurantDto;
import com.disagreed.independentrepo.mapper.RestaurantMapper;
import com.disagreed.independentrepo.model.entity.RestaurantEntity;
import com.disagreed.independentrepo.service.strategy.RestaurantStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantStrategy restaurantStrategy;

    private final RestaurantMapper restaurantMapper;

    @Override
    public List<RestaurantDto> getAll(Long typeCode) {
        List<RestaurantEntity> restaurantEntities = restaurantStrategy.getStrategy(typeCode).getAll();

        return restaurantMapper.toDto(restaurantEntities);
    }

    @Override
    public RestaurantDto getByRestaurantId(Long restaurantId, Long typeCode) {
        return restaurantStrategy.getStrategy(typeCode)
                .getByRestaurantId(restaurantId)
                .map(restaurantMapper::toDto)
                .orElseThrow(()-> new RuntimeException("Ресторан с идентификатором %d не найдено"
                        .formatted(restaurantId)));
    }
}