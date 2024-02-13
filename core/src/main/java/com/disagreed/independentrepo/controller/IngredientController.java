package com.disagreed.independentrepo.controller;

import com.disagreed.independentrepo.api.IngredientService;
import com.disagreed.independentrepo.dto.CityDto;
import com.disagreed.independentrepo.model.entity.IngredientEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/ingredient", produces = MediaType.APPLICATION_JSON_VALUE)
public class IngredientController {

    private final IngredientService ingredientService;

    @GetMapping(value = "/all")
    public List<IngredientEntity> getAllIngredient() {
        return ingredientService.getAll();
    }

    @GetMapping(value = "/{ingredientId}")
    public IngredientEntity getByIngredientId(@PathVariable Long ingredientId) {
        return ingredientService.getByIngredientId(ingredientId);
    }
}