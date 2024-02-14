package com.disagreed.independentrepo.service;

import com.disagreed.independentrepo.api.DishService;
import com.disagreed.independentrepo.dto.DishDto;
import com.disagreed.independentrepo.repository.mybatis.DishMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DishServiceImpl implements DishService {

    private final DishMapper dishRepository;

    private final com.disagreed.independentrepo.mapper.DishMapper dishMapper;

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
