package com.disagreed.independentrepo.api;

import com.disagreed.independentrepo.dto.DishDto;

import java.util.List;

/**
 * Сервис CRUD операций для класса DishDto.
 */
public interface DishService {

    /**
     * Получить все записи из таблицы dish.
     *
     * @param typeCode идентификатор типа репозитория
     */
    List<DishDto> getAll(Long typeCode);

    /**
     * Получить блюдо по идентификатору.
     *
     * @param dishId идентификатор блюда
     * @param typeCode идентификатор типа репозитория
     */
    DishDto getByDishId(Long dishId, Long typeCode);
}
