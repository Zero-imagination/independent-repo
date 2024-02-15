package com.disagreed.independentrepo.repository.impl.mybatis;

import com.disagreed.independentrepo.model.entity.RestaurantEntity;
import com.disagreed.independentrepo.repository.api.IndependentRestaurantRepository;
import com.disagreed.independentrepo.repository.mybatis.RestaurantMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
@ConditionalOnProperty(value = "repository.name", havingValue = "mybatis")
public class MybatisIndependentRestaurantRepositoryImpl implements IndependentRestaurantRepository {

    private final RestaurantMapper repository;

    @Override
    public List<RestaurantEntity> getAll() {
        return repository.getAll();
    }

    @Override
    public Optional<RestaurantEntity> getByRestaurantId(Long restaurantId) {
        return repository.getByRestaurantId(restaurantId);
    }
}