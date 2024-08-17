package com.disagreed.independentrepo.repository.mybatis;

import com.disagreed.independentrepo.model.entity.IngredientEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Маппер mybatis для сущности IngredientEntity.
 */
@Mapper
@Repository
public interface IngredientMapper {

    /**
     * Получить информацию об ингредиенте по идентификатору.
     *
     * @param ingredientId идентификатор ингредиента
     */
    Optional<IngredientEntity> getByIngredientId(@Param("ingredientId") Long ingredientId);

    /**
     * Получить все записи из таблицы ingredient.
     */
    List<IngredientEntity> getAll();

}