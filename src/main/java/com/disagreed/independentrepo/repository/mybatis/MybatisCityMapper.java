package com.disagreed.independentrepo.repository.mybatis;

import com.disagreed.independentrepo.model.entity.CityEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Mapper
@Repository
public interface MybatisCityMapper {

    @Select({"select * from city where action_ind != 'D'"})
    List<CityEntity> getAll();

    @Select({"select * from city where name=#{name} and action_ind !='D'"})
    Optional<CityEntity> getByName(@Param("name") String name);

    @Select({"select * from city where city_id=#{cityId} and action_ind != 'D'"})
    Optional<CityEntity> getById(@Param("cityId") Long cityId);

}
