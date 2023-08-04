package com.disagreed.independentrepo.repository;

import com.disagreed.independentrepo.model.entity.CityEntity;
import com.disagreed.independentrepo.repository.api.IndependentCityRepository;
import com.disagreed.independentrepo.repository.hibernate.HibernateCityRepository;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service()
@ConditionalOnProperty(value = "repository.name", havingValue = "hibernate")
public class HibernateIndependentCityRepositoryImpl implements IndependentCityRepository {

    private final HibernateCityRepository hibernateCityRepository;

    public HibernateIndependentCityRepositoryImpl(HibernateCityRepository hibernateCityRepository) {
        this.hibernateCityRepository = hibernateCityRepository;
    }

    //дописать тесты отдельные на mybatis
    @Override
    public Optional<CityEntity> getByCityId(Long cityId) {
        return hibernateCityRepository.findCityEntityByCityId(cityId);
    }

    @Override
    public Optional<CityEntity> getByName(String name) {
        return hibernateCityRepository.findCityEntityByName(name);
    }

    @Override
    public List<CityEntity> getAll() {
        return hibernateCityRepository.findAll();
    }
}
