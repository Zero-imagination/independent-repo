package com.disagreed.independentrepo.service.strategy;

import com.disagreed.independentrepo.enums.RepositoryType;
import com.disagreed.independentrepo.repository.api.IndependentCountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

/**
 * Стратегия выбора репозитория для Country.
 */
@RequiredArgsConstructor
@Service
public class CountryStrategy {

    private final Map<String, IndependentCountryRepository> countryStrategies;

    /**
     * Получить реализацию интерфейса репозитория по его идентификатору типа.
     *
     * @param typeCode идентификатор типа репозитория
     */
    public IndependentCountryRepository getStrategy(Long typeCode) {
        String serviceName = RepositoryType.getServiceNameByTypeCode(typeCode) + CountryStrategy.class.getSimpleName();
        return Optional.ofNullable(countryStrategies.get(serviceName))
                .orElseThrow(() -> new RuntimeException("Не найдено обработчика по имени %d".formatted(typeCode)));
    }
}
