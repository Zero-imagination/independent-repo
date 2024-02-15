package com.disagreed.independentrepo.repository.impl.mybatis;

import com.disagreed.independentrepo.model.entity.IngredientEntity;
import com.disagreed.independentrepo.repository.api.IndependentIngredientRepository;
import com.disagreed.independentrepo.repository.mybatis.IngredientMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@ConditionalOnProperty(value = "repository.name", havingValue = "mybatis")
public class MybatisIndependentIngredientRepository implements IndependentIngredientRepository {

    private final IngredientMapper repository;

    @Override
    public List<IngredientEntity> getAll() {
        return repository.getAll();
    }

    @Override
    public Optional<IngredientEntity> getByIngredientId(Long ingredientId) {
        return repository.getByIngredientId(ingredientId);
    }
}
