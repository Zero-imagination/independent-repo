package com.disagreed.independentrepo.service.strategy;

import com.disagreed.independentrepo.enums.RepositoryType;
import com.disagreed.independentrepo.repository.api.IndependentDishRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class DishStrategy {

    private final Map<String, IndependentDishRepository> dishStrategies;

    public IndependentDishRepository getStrategy(Long typeCode) {
        String serviceName = RepositoryType.getServiceNameByTypeCode(typeCode) + DishStrategy.class.getSimpleName();
        return Optional.ofNullable(dishStrategies.get(serviceName))
                .orElseThrow(() -> new RuntimeException("Не найдено обработчика по имени %d".formatted(typeCode)));
    }
}