package com.disagreed.independentrepo.service.strategy;

import com.disagreed.independentrepo.enums.RepositoryType;
import com.disagreed.independentrepo.repository.api.IndependentCountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CountryStrategy {

    private final Map<String, IndependentCountryRepository> countryStrategies;

    public IndependentCountryRepository getStrategy(Long typeCode) {
        String serviceName = RepositoryType.getServiceNameByTypeCode(typeCode) + CountryStrategy.class.getSimpleName();
        return Optional.ofNullable(countryStrategies.get(serviceName))
                .orElseThrow(() -> new RuntimeException("Не найдено обработчика по имени %d".formatted(typeCode)));
    }
}
