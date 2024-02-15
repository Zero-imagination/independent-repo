package com.disagreed.independentrepo.service;

import com.disagreed.independentrepo.api.CountryService;
import com.disagreed.independentrepo.dto.CountryDto;
import com.disagreed.independentrepo.mapper.CountryMapper;
import com.disagreed.independentrepo.model.entity.CountryEntity;
import com.disagreed.independentrepo.repository.impl.mybatis.MybatisIndependentCountryRepositoryImpl;
import com.disagreed.independentrepo.service.strategy.CountryStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {

    private final MybatisIndependentCountryRepositoryImpl countryRepository;

    private final CountryStrategy countryStrategy;

    private final CountryMapper countryMapper;

    public CountryDto getByCountryId(Long countryId, Long typeCode) {
        CountryEntity countryEntity = countryStrategy.getStrategy(typeCode).getByCountryId(countryId)
                .orElseThrow(()-> new RuntimeException("Страны с идентификатором %d не найдено".formatted(countryId)));
        return countryMapper.toDto(countryEntity);
    }

    public CountryDto getByName(String name) {
        CountryEntity countryEntity = countryRepository.getByName(name)
                .orElseThrow(()-> new RuntimeException("Страны с названием %s не найдено".formatted(name)));
        return countryMapper.toDto(countryEntity);
    }

    public List<CountryDto> getAll(Long typeCode) {
        List<CountryEntity> countryEntities = countryStrategy.getStrategy(typeCode).getAll();
        return countryMapper.toDto(countryEntities);
    }

    public Long getCountAll() {
        return countryRepository.countAll()
                .orElseThrow(()-> new RuntimeException("Не удалось получить количество стран"));
    }

    @Override
    public Boolean exists(Long counryId) {
        return countryRepository.exists(counryId);
    }

}
