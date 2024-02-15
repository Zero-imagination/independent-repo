package com.disagreed.independentrepo.repository.impl.hibernate;

import com.disagreed.independentrepo.model.ActionIndicatorEnum;
import com.disagreed.independentrepo.model.entity.CountryEntity;
import com.disagreed.independentrepo.repository.api.IndependentCountryRepository;
import com.disagreed.independentrepo.repository.hibernate.HibernateCountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("hibernateCountryStrategy")
@RequiredArgsConstructor
public class HibernateIndependentCountryRepositoryImpl implements IndependentCountryRepository {

    private final HibernateCountryRepository hibernateCountryRepository;

    @Override
    public Optional<CountryEntity> getByCountryId(Long countryId) {
        return hibernateCountryRepository.getCountryEntityByCountryId(countryId);
    }

    @Override
    public Optional<CountryEntity> getByName(String name) {
        return hibernateCountryRepository.findCountryEntityByName(name);
    }

    @Override
    public List<CountryEntity> getAll() {
        return hibernateCountryRepository.findAll();
    }

    @Override
    public Optional<Long> countAll() {
        return hibernateCountryRepository.countCountryEntitiesByActionIndIsNotLike(ActionIndicatorEnum.DELETE);
    }

    @Override
    public Boolean exists(Long countryId) {
        return hibernateCountryRepository.existsById(countryId);
    }
}
