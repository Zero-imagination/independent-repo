package com.disagreed.independentrepo.repository.hibernate;

import com.disagreed.independentrepo.model.entity.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
public interface HibernateCityRepository extends JpaRepository<CityEntity, Long> {

    Optional<CityEntity> findCityEntityByName(String name);

    Optional<CityEntity> findCityEntityByCityId(Long cityId);

    @Modifying
    @Query(value = "update city set action_ind = 'D' where city.city_id in :ids", nativeQuery = true)
    int markDeleteAll(@Param("ids") Collection<Long> ids);

}
