package com.disagreed.independentrepo.api;

import com.disagreed.independentrepo.dto.IngredientDto;

import java.util.List;

/**
 * Сервис CRUD операций для класса IngredientDto.
 */
public interface IngredientService {

    /**
     * Получить все записи из таблицы ingredient.
     */
    List<IngredientDto> getAll();

    /**
     * Получить информацию об ингредиенте по его идентификатору.
     *
     * @param ingredientId идентификатор ингредиента
     */
    IngredientDto getByIngredientId(Long ingredientId);

}