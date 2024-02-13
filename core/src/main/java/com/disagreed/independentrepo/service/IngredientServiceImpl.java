package com.disagreed.independentrepo.service;

import com.disagreed.independentrepo.api.IngredientService;
import com.disagreed.independentrepo.model.entity.IngredientEntity;
import com.disagreed.independentrepo.repository.mybatis.IngredientMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IngredientServiceImpl implements IngredientService {

    private final IngredientMapper ingredientMapper;

    @Override
    public List<IngredientEntity> getAll() {
        return ingredientMapper.getAll();
    }

    @Override
    public IngredientEntity getByIngredientId(Long ingredientId) {
        return ingredientMapper.getByIngredientId(ingredientId)
                .orElseThrow(()-> new RuntimeException("Ингредиента с идентификатором %s не найдено"
                        .formatted(ingredientId)));
    }
}