package com.disagreed.independentrepo.repository.mybatis;

import com.disagreed.independentrepo.model.entity.CityEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Mapper
@Repository
public interface CityMapper {

    List<CityEntity> getAll();

    Optional<CityEntity> getByName(@Param("name") String name);

    Optional<CityEntity> getByCityId(@Param("cityId") Long cityId);

}
