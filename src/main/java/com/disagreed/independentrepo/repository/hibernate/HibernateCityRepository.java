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

    @Query(value = "select * from city where name = :name and city.action_ind != 'D'", nativeQuery = true)
    Optional<CityEntity> findCityEntityByName(@Param("name") String name);

    @Query("select city from CityEntity city where city.cityId=:id and city.actionInd <> 'D'")
    Optional<CityEntity> findCityEntityByCityId(@Param("id") Long cityId);

    @Modifying
    @Query(value = "update city set action_ind = 'D' where city.city_id in :ids", nativeQuery = true)
    int markDeleteAll(@Param("ids") Collection<Long> ids);

}
