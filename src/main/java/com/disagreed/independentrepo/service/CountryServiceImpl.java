package com.disagreed.independentrepo.service;

import com.disagreed.independentrepo.dto.CountryDto;
import com.disagreed.independentrepo.mapper.CountryMapper;
import com.disagreed.independentrepo.model.entity.CountryEntity;
import com.disagreed.independentrepo.repository.api.IndependentCountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService{

    private final IndependentCountryRepository countryRepository;

    @Autowired
    private CountryMapper countryMapper;

    public CountryServiceImpl(IndependentCountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public CountryDto getByCountryId(Long countryId) {
        CountryEntity countryEntity = countryRepository.getByCountryId(countryId)
                .orElseThrow(()-> new RuntimeException("Страны с идентификатором %d не найдено".formatted(countryId)));
        return countryMapper.toDto(countryEntity);
    }

    public CountryDto getByName(String name) {
        CountryEntity countryEntity = countryRepository.getByName(name)
                .orElseThrow(()-> new RuntimeException("Страны с названием %s не найдено".formatted(name)));
        return countryMapper.toDto(countryEntity);
    }

    public List<CountryDto> getAll() {
        return countryMapper.toDto(countryRepository.getAll());
    }

    public Long getCountAll() {
        return countryRepository.countAll()
                .orElseThrow(()-> new RuntimeException("Не удалось получить количество стран"));
    }

}
