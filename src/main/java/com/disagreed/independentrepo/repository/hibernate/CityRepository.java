package com.disagreed.independentrepo.repository.hibernate;

import com.disagreed.independentrepo.model.entity.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CityRepository extends JpaRepository<CityEntity, Long> {

    Optional<CityEntity> findCityEntityByName(String name);

    Optional<CityEntity> findCityEntityByCityId(Long cityId);
}
