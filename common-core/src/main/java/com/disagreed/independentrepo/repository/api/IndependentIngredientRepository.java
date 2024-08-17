package com.disagreed.independentrepo.repository.api;

import com.disagreed.independentrepo.model.entity.IngredientEntity;

import java.util.List;
import java.util.Optional;

/**
 * Интерфейс CRUD операций для класса IngredientEntity.
 */
public interface IndependentIngredientRepository {

    /**
     * Получить все записи из таблицы ingredient.
     */
    List<IngredientEntity> getAll();

    /**
     * Получить информацию об ингредиенте по его идентификатору.
     *
     * @param ingredientId идентификатор ингредиента
     */
    Optional<IngredientEntity> getByIngredientId(Long ingredientId);
}
