package com.disagreed.independentrepo.controller;

import com.disagreed.independentrepo.api.IngredientService;
import com.disagreed.independentrepo.dto.IngredientDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Контроллер для работы с ингредиентами.
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/ingredient", produces = MediaType.APPLICATION_JSON_VALUE)
public class IngredientController {

    private final IngredientService ingredientService;

    /**
     * Получить все записи из таблицы ingredient.
     */
    @GetMapping(value = "/all")
    public List<IngredientDto> getAllIngredient() {
        return ingredientService.getAll();
    }

    /**
     * Получить информацию об ингредиенте по его идентификатору.
     *
     * @param ingredientId идентификатор ингредиента
     */
    @GetMapping(value = "/{ingredientId}")
    public IngredientDto getByIngredientId(@PathVariable Long ingredientId) {
        return ingredientService.getByIngredientId(ingredientId);
    }
}