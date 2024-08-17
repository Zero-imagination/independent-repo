package com.disagreed.independentrepo.controller;

import com.disagreed.independentrepo.api.RestaurantService;
import com.disagreed.independentrepo.dto.RestaurantDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Контроллер для работы с рестораном.
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/restaurant", produces = MediaType.APPLICATION_JSON_VALUE)
public class RestaurantController {

    private final RestaurantService restaurantService;

    /**
     * Получить все записи из таблицы restaurant.
     *
     * @param typeCode идентификатор типа репозитория
     */
    @GetMapping(value = "/all")
    public List<RestaurantDto> getAllRestaurant(@RequestParam(defaultValue = "0") Long typeCode) {
        return restaurantService.getAll(typeCode);
    }

    /**
     * Получить информацию о ресторане по его идентификатору.
     *
     * @param restaurantId идентификатор ресторана
     * @param typeCode идентификатор типа репозитория
     */
    @GetMapping(value = "/{restaurantId}")
    public RestaurantDto getByRestaurantId(@PathVariable Long restaurantId,
                                           @RequestParam(defaultValue = "0") Long typeCode) {
        return restaurantService.getByRestaurantId(restaurantId, typeCode);
    }
}