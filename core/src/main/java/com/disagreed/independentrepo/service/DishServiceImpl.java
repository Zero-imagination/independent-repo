package com.disagreed.independentrepo.service;

import com.disagreed.independentrepo.api.DishService;
import com.disagreed.independentrepo.dto.DishDto;
import com.disagreed.independentrepo.mapper.DishMapper;
import com.disagreed.independentrepo.repository.api.IndependentDishRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DishServiceImpl implements DishService {

    private final IndependentDishRepository dishRepository;

    private final DishMapper dishMapper;

    @Override
    public List<DishDto> getAll() {
        return dishMapper.toDto(dishRepository.getAll());
    }

    @Override
    public DishDto getByDishId(Long dishId) {
        return dishRepository.getByDishId(dishId)
                .map(dishMapper::toDto)
                .orElseThrow(()-> new RuntimeException("Блюда с идентификатором %s не найдено"
                        .formatted(dishId)));
    }
}
