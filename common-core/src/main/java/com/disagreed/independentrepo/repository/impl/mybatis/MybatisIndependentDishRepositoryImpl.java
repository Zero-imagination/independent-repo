package com.disagreed.independentrepo.repository.impl.mybatis;

import com.disagreed.independentrepo.model.entity.DishEntity;
import com.disagreed.independentrepo.repository.api.IndependentDishRepository;
import com.disagreed.independentrepo.repository.mybatis.DishMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@ConditionalOnProperty(value = "repository.name", havingValue = "mybatis")
public class MybatisIndependentDishRepositoryImpl implements IndependentDishRepository {

    private final DishMapper repository;

    @Override
    public List<DishEntity> getAll() {
        return repository.getAll();
    }

    @Override
    public Optional<DishEntity> getByDishId(Long dishId) {
        return repository.getByDishId(dishId);
    }
}
