package com.disagreed.independentrepo.service;

import com.disagreed.independentrepo.api.IngredientService;
import com.disagreed.independentrepo.dto.IngredientDto;
import com.disagreed.independentrepo.mapper.IngredientMapper;
import com.disagreed.independentrepo.repository.api.IndependentIngredientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IngredientServiceImpl implements IngredientService {

    private final IndependentIngredientRepository ingredientRepository;

    private final IngredientMapper ingredientMapper;

    @Override
    public List<IngredientDto> getAll() {
        return ingredientMapper.toDto(ingredientRepository.getAll());
    }

    @Override
    public IngredientDto getByIngredientId(Long ingredientId) {
        return ingredientRepository.getByIngredientId(ingredientId)
                .map(ingredientMapper::toDto)
                .orElseThrow(()-> new RuntimeException("Ингредиента с идентификатором %s не найдено"
                        .formatted(ingredientId)));
    }
}