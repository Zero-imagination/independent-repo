package com.disagreed.independentrepo.service;

import com.disagreed.independentrepo.api.RestaurantService;
import com.disagreed.independentrepo.dto.RestaurantDto;
import com.disagreed.independentrepo.mapper.RestaurantMapper;
import com.disagreed.independentrepo.repository.api.IndependentRestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RestaurantServiceImpl implements RestaurantService {

    private final IndependentRestaurantRepository restaurantRepository;

    private final RestaurantMapper restaurantMapper;

    @Override
    public List<RestaurantDto> getAll() {
        return restaurantMapper.toDto(restaurantRepository.getAll());
    }

    @Override
    public RestaurantDto getByRestaurantId(Long restaurantId) {
        return restaurantRepository.getByRestaurantId(restaurantId)
                .map(restaurantMapper::toDto)
                .orElseThrow(()-> new RuntimeException("Ресторан с идентификатором %s не найдено"
                        .formatted(restaurantId)));
    }
}