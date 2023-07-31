package com.disagreed.independentrepo.repository.api;

import com.disagreed.independentrepo.model.entity.CityEntity;

import java.util.List;
import java.util.Optional;

public interface IndependentCityRepository {

    Optional<CityEntity> getByCityId(Long cityId);

    Optional<CityEntity> getByName(String name);

    List<CityEntity> getAll();

}
