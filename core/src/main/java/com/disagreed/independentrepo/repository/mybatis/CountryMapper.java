package com.disagreed.independentrepo.repository.mybatis;

import com.disagreed.independentrepo.model.entity.CountryEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Mapper
public interface CountryMapper {

    Optional<CountryEntity> getByCountryId(@Param("countryId") Long countryId);

    Optional<CountryEntity> getByName(@Param("name") String name);

    List<CountryEntity> getAll();

    Optional<Long> countAll();

    Boolean exists(Long countryId);

}
