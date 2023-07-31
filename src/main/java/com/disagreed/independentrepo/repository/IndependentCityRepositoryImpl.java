package com.disagreed.independentrepo.repository;

import com.disagreed.independentrepo.model.RepositoryName;
import com.disagreed.independentrepo.model.entity.CityEntity;
import com.disagreed.independentrepo.repository.api.IndependentCityRepository;
import com.disagreed.independentrepo.repository.hibernate.HibernateCityRepository;
import com.disagreed.independentrepo.repository.mybatis.MybatisCityMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class IndependentCityRepositoryImpl implements IndependentCityRepository {

    @Value("${repository.name}")
    private String currentRepository;

    private final HibernateCityRepository hibernateCityRepository;

    private final MybatisCityMapper mybatisCityRepository;

    public IndependentCityRepositoryImpl(HibernateCityRepository hibernateCityRepository,
                                         MybatisCityMapper mybatisCityRepository) {
        this.hibernateCityRepository = hibernateCityRepository;
        this.mybatisCityRepository = mybatisCityRepository;
    }

    @Override
    public Optional<CityEntity> getByCityId(Long cityId) {
        if (RepositoryName.HIBERNATE.getName().equals(currentRepository)) {
            return hibernateCityRepository.findCityEntityByCityId(cityId);
        }
        if (RepositoryName.MYBATIS.getName().equals(currentRepository)) {
            return mybatisCityRepository.getById(cityId);
        }
        return Optional.empty();
    }

    @Override
    public Optional<CityEntity> getByName(String name) {
        if (RepositoryName.HIBERNATE.getName().equals(currentRepository)) {
            return hibernateCityRepository.findCityEntityByName(name);
        }
        if (RepositoryName.MYBATIS.getName().equals(currentRepository)) {
            return mybatisCityRepository.getByName(name);
        }
        return Optional.empty();
    }

    @Override
    public List<CityEntity> getAll() {
        if (RepositoryName.HIBERNATE.getName().equals(currentRepository)) {
            return hibernateCityRepository.findAll();
        }
        if (RepositoryName.MYBATIS.getName().equals(currentRepository)) {
            return mybatisCityRepository.getAll();
        }
        return Collections.emptyList();
    }
}
