package com.disagreed.independentrepo.api;

import com.disagreed.independentrepo.dto.RestaurantDto;

import java.util.List;

/**
 * Сервис CRUD операций для класса RestaurantDto.
 */
public interface RestaurantService {

    /**
     * Получить все записи из таблицы restaurant.
     *
     * @param typeCode идентификатор типа репозитория
     */
    List<RestaurantDto> getAll(Long typeCode);

    /**
     * Получить информацию о ресторане по его идентификатору.
     *
     * @param restaurantId идентификатор ресторана
     * @param typeCode идентификатор типа репозитория
     */
    RestaurantDto getByRestaurantId(Long restaurantId, Long typeCode);
}