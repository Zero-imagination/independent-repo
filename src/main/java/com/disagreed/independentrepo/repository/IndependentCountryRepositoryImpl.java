package com.disagreed.independentrepo.repository;

import com.disagreed.independentrepo.model.ActionIndicatorEnum;
import com.disagreed.independentrepo.model.RepositoryName;
import com.disagreed.independentrepo.model.entity.CountryEntity;
import com.disagreed.independentrepo.repository.api.IndependentCountryRepository;
import com.disagreed.independentrepo.repository.hibernate.HibernateCountryRepository;
import com.disagreed.independentrepo.repository.mybatis.MybatisCountryMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class IndependentCountryRepositoryImpl implements IndependentCountryRepository {

    @Value("${repository.name}")
    private String currentRepository;

    private final HibernateCountryRepository hibernateCountryRepository;

    private final MybatisCountryMapper mybatisCountryRepository;

    public IndependentCountryRepositoryImpl(HibernateCountryRepository hibernateCountryRepository, MybatisCountryMapper mybatisCountryRepository) {
        this.hibernateCountryRepository = hibernateCountryRepository;
        this.mybatisCountryRepository = mybatisCountryRepository;
    }

    @Override
    public Optional<CountryEntity> getByCountryId(Long countryId) {
        if (RepositoryName.HIBERNATE.getName().equals(currentRepository)) {
            return hibernateCountryRepository.getCountryEntityByCountryId(countryId);
        }
        if (RepositoryName.MYBATIS.getName().equals(currentRepository)) {
            return mybatisCountryRepository.getByCountryId(countryId);
        }
        return Optional.empty();
    }

    @Override
    public Optional<CountryEntity> getByName(String name) {
        if (RepositoryName.HIBERNATE.getName().equals(currentRepository)) {
            return hibernateCountryRepository.findCountryEntityByName(name);
        }
        if (RepositoryName.MYBATIS.getName().equals(currentRepository)) {
            return mybatisCountryRepository.getByName(name);
        }
        return Optional.empty();
    }

    @Override
    public List<CountryEntity> getAll() {
        if (RepositoryName.HIBERNATE.getName().equals(currentRepository)) {
            return hibernateCountryRepository.findAll();
        }
        if (RepositoryName.MYBATIS.getName().equals(currentRepository)) {
            return mybatisCountryRepository.getAll();
        }
        return Collections.emptyList();
    }

    @Override
    public Optional<Long> countAll() {
        if (RepositoryName.HIBERNATE.getName().equals(currentRepository)) {
            return hibernateCountryRepository.countCountryEntitiesByActionIndIsNotLike(ActionIndicatorEnum.DELETE);
        }
        if (RepositoryName.MYBATIS.getName().equals(currentRepository)) {
            return mybatisCountryRepository.countAll();
        }
        return Optional.empty();
    }
}
