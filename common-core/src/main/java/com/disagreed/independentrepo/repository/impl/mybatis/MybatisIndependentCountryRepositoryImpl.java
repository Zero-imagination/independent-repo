package com.disagreed.independentrepo.repository.impl.mybatis;

import com.disagreed.independentrepo.model.entity.CountryEntity;
import com.disagreed.independentrepo.repository.api.IndependentCountryRepository;
import com.disagreed.independentrepo.repository.mybatis.CountryMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@ConditionalOnProperty(value = "repository.name", havingValue = "mybatis")
public class MybatisIndependentCountryRepositoryImpl implements IndependentCountryRepository {

    private final CountryMapper mybatisCountryRepository;

    public MybatisIndependentCountryRepositoryImpl(
            CountryMapper mybatisCountryRepository) {this.mybatisCountryRepository = mybatisCountryRepository;}

    @Override
    public Optional<CountryEntity> getByCountryId(Long countryId) {
        return mybatisCountryRepository.getByCountryId(countryId);
    }

    @Override
    public Optional<CountryEntity> getByName(String name) {
        return mybatisCountryRepository.getByName(name);
    }

    @Override
    public List<CountryEntity> getAll() {
        return mybatisCountryRepository.getAll();
    }

    @Override
    public Optional<Long> countAll() {
        return mybatisCountryRepository.countAll();
    }

    @Override
    public Boolean exists(Long countryId) {
        return mybatisCountryRepository.exists(countryId);
    }
}
