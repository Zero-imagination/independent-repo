package com.disagreed.independentrepo.controller;

import com.disagreed.independentrepo.api.RestaurantService;
import com.disagreed.independentrepo.dto.RestaurantDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/restaurant", produces = MediaType.APPLICATION_JSON_VALUE)
public class RestaurantController {

    private final RestaurantService restaurantService;

    @GetMapping(value = "/all")
    public List<RestaurantDto> getAllRestaurant() {
        return restaurantService.getAll();
    }

    @GetMapping(value = "/{restaurantId}")
    public RestaurantDto getByRestaurantId(@PathVariable Long restaurantId) {
        return restaurantService.getByRestaurantId(restaurantId);
    }
}