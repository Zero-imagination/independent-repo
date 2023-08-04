package com.disagreed.independentrepo.repository;

import com.disagreed.independentrepo.model.entity.CityEntity;
import com.disagreed.independentrepo.repository.api.IndependentCityRepository;
import com.disagreed.independentrepo.repository.mybatis.MybatisCityMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@ConditionalOnProperty(value = "repository.name", havingValue = "mybatis")
public class MybatisIndependentCityRepositoryImpl implements IndependentCityRepository {

    private final MybatisCityMapper repository;

    public MybatisIndependentCityRepositoryImpl(MybatisCityMapper repository) {
        this.repository = repository;
    }

    @Override
    public Optional<CityEntity> getByCityId(Long cityId) {
        return repository.getById(cityId);
    }

    @Override
    public Optional<CityEntity> getByName(String name) {
        return repository.getByName(name);
    }

    @Override
    public List<CityEntity> getAll() {
        return repository.getAll();
    }
}
