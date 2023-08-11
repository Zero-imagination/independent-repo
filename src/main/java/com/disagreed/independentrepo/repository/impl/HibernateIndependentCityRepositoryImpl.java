package com.disagreed.independentrepo.repository.impl;

import com.disagreed.independentrepo.model.ActionIndicatorEnum;
import com.disagreed.independentrepo.model.entity.CityEntity;
import com.disagreed.independentrepo.repository.api.IndependentCityRepository;
import com.disagreed.independentrepo.repository.hibernate.HibernateCityRepository;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@ConditionalOnProperty(value = "repository.name", havingValue = "hibernate")
public class HibernateIndependentCityRepositoryImpl implements IndependentCityRepository {

    private final HibernateCityRepository hibernateCityRepository;

    public HibernateIndependentCityRepositoryImpl(HibernateCityRepository hibernateCityRepository) {
        this.hibernateCityRepository = hibernateCityRepository;
    }

    @Override
    public int saveAll(Collection<CityEntity> cities) {
        hibernateCityRepository.saveAll(cities);
        return 1;
    }

    @Override
    public int updateAll(Collection<CityEntity> cities) {
        fillBaseAbstractSystemAttributes(cities);
        hibernateCityRepository.saveAll(cities);
        return 1;
    }

    @Override
    public int markDeleteAll(Collection<Long> ids) {
        return hibernateCityRepository.markDeleteAll(ids);
    }

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

    @Override
    public List<CityEntity> getAllByCountryIds(Collection<Long> countryIds) {
        return Collections.emptyList();
    }

    private void fillBaseAbstractSystemAttributes(Collection<CityEntity> cities) {
        cities.forEach(cityEntity -> {
            cityEntity.setActionInd(ActionIndicatorEnum.UPDATE);
            cityEntity.setModifyDttm(OffsetDateTime.now());
        });
    }
}
