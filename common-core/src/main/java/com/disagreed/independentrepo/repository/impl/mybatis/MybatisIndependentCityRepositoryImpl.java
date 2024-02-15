package com.disagreed.independentrepo.repository.impl.mybatis;

import com.disagreed.independentrepo.model.entity.CityEntity;
import com.disagreed.independentrepo.repository.api.IndependentCityRepository;
import com.disagreed.independentrepo.repository.mybatis.CityMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
@ConditionalOnProperty(value = "repository.name", havingValue = "mybatis")
public class MybatisIndependentCityRepositoryImpl implements IndependentCityRepository {

    private final CityMapper repository;

    public MybatisIndependentCityRepositoryImpl(CityMapper repository) {
        this.repository = repository;
    }

    @Override
    public int saveAll(Collection<CityEntity> cities) {
        return repository.saveAll(cities);
    }

    @Override
    public int updateAll(Collection<CityEntity> cities) {
        return repository.updateAll(cities);
    }

    @Override
    public int markDeleteAll(Collection<Long> ids) {
        return repository.markDeleteAll(ids);
    }

    @Override
    public Optional<CityEntity> getByCityId(Long cityId) {
        return repository.getByCityId(cityId);
    }

    @Override
    public Optional<CityEntity> getByName(String name) {
        return repository.getByName(name);
    }

    @Override
    public List<CityEntity> getAll() {
        return repository.getAll();
    }

    @Override
    public List<CityEntity> getAllByCountryIds(Collection<Long> countryIds) {
        return repository.getAllByCountryIds(countryIds);
    }
}
