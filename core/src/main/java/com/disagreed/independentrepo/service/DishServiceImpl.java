package com.disagreed.independentrepo.service;

import com.disagreed.independentrepo.api.DishService;
import com.disagreed.independentrepo.dto.DishDto;
import com.disagreed.independentrepo.mapper.DishMapper;
import com.disagreed.independentrepo.model.entity.DishEntity;
import com.disagreed.independentrepo.service.strategy.DishStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DishServiceImpl implements DishService {

    private final DishStrategy dishStrategy;

    private final DishMapper dishMapper;

    @Override
    public List<DishDto> getAll(Long typeCode) {
        List<DishEntity> dishEntities = dishStrategy.getStrategy(typeCode).getAll();
        return dishMapper.toDto(dishEntities);
    }

    @Override
    public DishDto getByDishId(Long dishId, Long typeCode) {
        return dishStrategy.getStrategy(typeCode)
                .getByDishId(dishId)
                .map(dishMapper::toDto)
                .orElseThrow(()-> new RuntimeException("Блюда с идентификатором %s не найдено"
                        .formatted(dishId)));
    }
}
