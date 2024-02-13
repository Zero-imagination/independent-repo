package com.disagreed.independentrepo.service;

import com.disagreed.independentrepo.api.DishService;
import com.disagreed.independentrepo.model.entity.DishEntity;
import com.disagreed.independentrepo.repository.mybatis.DishMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DishServiceImpl implements DishService {

    private final DishMapper dishMapper;
    @Override
    public List<DishEntity> getAll() {
        return dishMapper.getAll();
    }

    @Override
    public DishEntity getByDishId(Long dishId) {
        return dishMapper.getByDishId(dishId)
                .orElseThrow(()-> new RuntimeException("Блюда с идентификатором %s не найдено"
                        .formatted(dishId)));
    }
}
