package com.disagreed.independentrepo.repository.mybatis;

import com.disagreed.independentrepo.model.entity.RestaurantEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Mapper
@Repository
public interface RestaurantMapper {

    Optional<RestaurantEntity> getByRestaurantId(@Param("restaurantId") Long restaurantId);

    List<RestaurantEntity> getAll();
}