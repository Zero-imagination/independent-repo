package com.disagreed.independentrepo.repository.api;

import com.disagreed.independentrepo.model.entity.RestaurantEntity;

import java.util.List;
import java.util.Optional;

/**
 * Интерфейс CRUD операций для класса RestaurantEntity.
 */
public interface IndependentRestaurantRepository {

    /**
     * Получить все записи из таблицы restaurant.
     */
    List<RestaurantEntity> getAll();

    /**
     * Получить информацию о ресторане по его идентификатору.
     *
     * @param restaurantId идентификатор ресторана
     */
    Optional<RestaurantEntity> getByRestaurantId(Long restaurantId);
}