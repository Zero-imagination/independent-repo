package com.disagreed.independentrepo.repository.impl.hibernate;

import com.disagreed.independentrepo.model.entity.IngredientEntity;
import com.disagreed.independentrepo.repository.api.IndependentIngredientRepository;
import com.disagreed.independentrepo.repository.hibernate.HibernateIngredientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@ConditionalOnProperty(value = "repository.name", havingValue = "hibernate")
public class HibernateIndependentIngredientRepository implements IndependentIngredientRepository {

    private final HibernateIngredientRepository repository;

    @Override
    public List<IngredientEntity> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<IngredientEntity> getByIngredientId(Long ingredientId) {
        return repository.findIngredientEntityById(ingredientId);
    }
}
