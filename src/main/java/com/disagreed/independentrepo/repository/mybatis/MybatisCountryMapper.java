package com.disagreed.independentrepo.repository.mybatis;

import com.disagreed.independentrepo.model.entity.CountryEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Mapper
@Repository
public interface MybatisCountryMapper {

    @Select({"select * from country where country_id=#{countryId} and action_ind != 'D'"})
    Optional<CountryEntity> getByCountryId(@Param("countryId") Long cityId);

    @Select({"select * from country where name=#{name} and action_ind !='D'"})
    Optional<CountryEntity> getByName(@Param("name") String name);

    @Select({"select * from country where action_ind !='D'"})
    List<CountryEntity> getAll();

    @Select({"select count(*) from country where action_ind !='D'"})
    Optional<Long> countAll();

}
