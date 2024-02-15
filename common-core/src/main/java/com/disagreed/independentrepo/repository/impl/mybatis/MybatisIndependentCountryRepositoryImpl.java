package com.disagreed.independentrepo.repository.impl.mybatis;

import com.disagreed.independentrepo.model.entity.CountryEntity;
import com.disagreed.independentrepo.repository.api.IndependentCountryRepository;
import com.disagreed.independentrepo.repository.mybatis.CountryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("mybatisCountryStrategy")
@RequiredArgsConstructor
public class MybatisIndependentCountryRepositoryImpl implements IndependentCountryRepository {

    private final CountryMapper mybatisCountryRepository;

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
