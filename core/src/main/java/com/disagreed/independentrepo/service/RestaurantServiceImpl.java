package com.disagreed.independentrepo.service;

import com.disagreed.independentrepo.api.RestaurantService;
import com.disagreed.independentrepo.model.entity.RestaurantEntity;
import com.disagreed.independentrepo.repository.mybatis.RestaurantMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantMapper restaurantMapper;
    @Override
    public List<RestaurantEntity> getAll() {
        return restaurantMapper.getAll();
    }

    @Override
    public RestaurantEntity getByRestaurantId(Long restaurantId) {
        return restaurantMapper.getByRestaurantId(restaurantId)
                .orElseThrow(()-> new RuntimeException("Ресторан с идентификатором %s не найдено"
                        .formatted(restaurantId)));
    }
}