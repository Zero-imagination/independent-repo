package com.disagreed.independentrepo.repository.api;

import com.disagreed.independentrepo.model.entity.CityEntity;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface IndependentCityRepository {

    int saveAll(Collection<CityEntity> cities);

    int updateAll(Collection<CityEntity> cities);

    int markDeleteAll(Collection<Long> ids);

    Optional<CityEntity> getByCityId(Long cityId);

    Optional<CityEntity> getByName(String name);

    List<CityEntity> getAll();

    List<CityEntity> getAllByCountryIds(Collection<Long> countryIds);

}
