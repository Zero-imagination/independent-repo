package com.disagreed.independentrepo.repository.api;

import com.disagreed.independentrepo.model.entity.DishEntity;

import java.util.List;
import java.util.Optional;

/**
 * Интерфейс CRUD операций для класса DishEntity.
 */
public interface IndependentDishRepository {

    /**
     * Получить все записи из таблицы dish.
     */
    List<DishEntity> getAll();

    /**
     * Получить информацию о блюде по его идентификатору.
     *
     * @param dishId идентификатор блюда
     */
    Optional<DishEntity> getByDishId(Long dishId);
}
