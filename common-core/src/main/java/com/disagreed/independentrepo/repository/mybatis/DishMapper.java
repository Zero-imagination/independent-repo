package com.disagreed.independentrepo.repository.mybatis;

import com.disagreed.independentrepo.model.entity.DishEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Mapper
@Repository
public interface DishMapper {

    Optional<DishEntity> getByDishId(@Param("dishId") Long dishId);

    List<DishEntity> getAll();
}