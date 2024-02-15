package com.disagreed.independentrepo.repository.impl.hibernate;

import com.disagreed.independentrepo.model.entity.DishEntity;
import com.disagreed.independentrepo.repository.api.IndependentDishRepository;
import com.disagreed.independentrepo.repository.hibernate.HibernateDishRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@ConditionalOnProperty(value = "repository.name", havingValue = "hibernate")
public class HibernateIndependentDishRepositoryImpl implements IndependentDishRepository {

    private final HibernateDishRepository repository;

    @Override
    public List<DishEntity> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<DishEntity> getByDishId(Long dishId) {
        return repository.findDishEntityById(dishId);
    }
}
