package com.disagreed.independentrepo.service.strategy;

import com.disagreed.independentrepo.enums.RepositoryType;
import com.disagreed.independentrepo.repository.api.IndependentRestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

/**
 * Стратегия выбора репозитория для Restaurant.
 */
@RequiredArgsConstructor
@Service
public class RestaurantStrategy {

    private final Map<String, IndependentRestaurantRepository> restaurantStrategies;

    /**
     * Получить реализацию интерфейса репозитория по его идентификатору типа.
     *
     * @param typeCode идентификатор типа репозитория
     */
    public IndependentRestaurantRepository getStrategy(Long typeCode) {
        String serviceName = RepositoryType.getServiceNameByTypeCode(typeCode) + RestaurantStrategy.class.getSimpleName();
        return Optional.ofNullable(restaurantStrategies.get(serviceName))
                .orElseThrow(() -> new RuntimeException("Не найдено обработчика по имени %d".formatted(typeCode)));
    }

}