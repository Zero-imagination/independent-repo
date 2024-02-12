package com.disagreed.independentrepo.repository.api;

import com.disagreed.independentrepo.model.entity.CountryEntity;

import java.util.List;
import java.util.Optional;

public interface IndependentCountryRepository {

    Optional<CountryEntity> getByCountryId(Long countryId);

    Optional<CountryEntity> getByName(String name);

    List<CountryEntity> getAll();

    Optional<Long> countAll();

    Boolean exists(Long countryId);

}
