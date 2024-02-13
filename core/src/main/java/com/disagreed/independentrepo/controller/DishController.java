package com.disagreed.independentrepo.controller;

import com.disagreed.independentrepo.api.DishService;
import com.disagreed.independentrepo.model.entity.DishEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/dish", produces = MediaType.APPLICATION_JSON_VALUE)
public class DishController {

    private final DishService dishService;

    @GetMapping(value = "/all")
    public List<DishEntity> getAllDish() {
        return dishService.getAll();
    }

    @GetMapping(value = "/{dishId}")
    public DishEntity getByIngredientId(@PathVariable Long dishId) {
        return dishService.getByDishId(dishId);
    }
}