package com.disagreed.independentrepo.controller;

import com.disagreed.independentrepo.api.DishService;
import com.disagreed.independentrepo.dto.DishDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Контроллер для работы с блюдами.
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/dish", produces = MediaType.APPLICATION_JSON_VALUE)
public class DishController {

    private final DishService dishService;

    /**
     * Получить все записи из таблицы dish.
     *
     * @param typeCode идентификатор типа репозитория
     */
    @GetMapping(value = "/all")
    public List<DishDto> getAllDish(@RequestParam(defaultValue = "0") Long typeCode) {
        return dishService.getAll(typeCode);
    }

    /**
     * Получить блюдо по идентификатору.
     *
     * @param dishId идентификатор блюда
     * @param typeCode идентификатор типа репозитория
     */
    @GetMapping(value = "/{dishId}")
    public DishDto getByIngredientId(@PathVariable Long dishId,
                                     @RequestParam(defaultValue = "0") Long typeCode) {
        return dishService.getByDishId(dishId, typeCode);
    }
}