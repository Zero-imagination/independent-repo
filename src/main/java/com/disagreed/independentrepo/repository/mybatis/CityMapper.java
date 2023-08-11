package com.disagreed.independentrepo.repository.mybatis;

import com.disagreed.independentrepo.model.entity.CityEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Mapper
@Repository
public interface CityMapper {

    int saveAll(@Param("cities") Collection<CityEntity> cities);

    int updateAll(@Param("cities") Collection<CityEntity> cities);

    int markDeleteAll(@Param("ids") Collection<Long> ids);

    Optional<CityEntity> getByName(@Param("name") String name);

    Optional<CityEntity> getByCityId(@Param("cityId") Long cityId);

    List<CityEntity> getAll();

    List<CityEntity> getAllByCountryIds(@Param("countryIds") Collection<Long> countryIds);

}
