package com.disagreed.independentrepo.repository.mybatis;

import com.disagreed.independentrepo.model.entity.RestaurantEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Маппер mybatis для сущности RestaurantEntity.
 */
@Mapper
@Repository
public interface RestaurantMapper {

    /**
     * Получить ресторан по идентификатору.
     *
     * @param restaurantId идентификатор ресторана
     */
    Optional<RestaurantEntity> getByRestaurantId(@Param("restaurantId") Long restaurantId);

    /**
     * Получить все записи из таблицы restaurant.
     */
    List<RestaurantEntity> getAll();
}