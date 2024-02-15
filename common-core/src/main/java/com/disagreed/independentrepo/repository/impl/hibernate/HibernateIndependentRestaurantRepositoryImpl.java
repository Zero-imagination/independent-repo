package com.disagreed.independentrepo.repository.impl.hibernate;

import com.disagreed.independentrepo.model.entity.RestaurantEntity;
import com.disagreed.independentrepo.repository.api.IndependentRestaurantRepository;
import com.disagreed.independentrepo.repository.hibernate.HibernateRestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("hibernateRestaurantStrategy")
@RequiredArgsConstructor
public class HibernateIndependentRestaurantRepositoryImpl implements IndependentRestaurantRepository {

    private final HibernateRestaurantRepository repository;

    @Override
    public List<RestaurantEntity> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<RestaurantEntity> getByRestaurantId(Long restaurantId) {
        return repository.findRestaurantEntityById(restaurantId);
    }
}