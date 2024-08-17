package com.disagreed.independentrepo.repository.mybatis;

import com.disagreed.independentrepo.model.entity.DishEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Маппер mybatis для сущности DishEntity.
 */
@Mapper
@Repository
public interface DishMapper {

    /**
     * Получить информацию о блюде по его идентификатору.
     *
     * @param dishId идентификатор блюда
     */
    Optional<DishEntity> getByDishId(@Param("dishId") Long dishId);

    /**
     * Получить все записи из таблицы dish.
     */
    List<DishEntity> getAll();
}