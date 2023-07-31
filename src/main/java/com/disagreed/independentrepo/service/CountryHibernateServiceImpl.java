package com.disagreed.independentrepo.service;

import com.disagreed.independentrepo.dto.CountryDto;
import com.disagreed.independentrepo.mapper.CountryMapper;
import com.disagreed.independentrepo.model.entity.CountryEntity;
import com.disagreed.independentrepo.repository.hibernate.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryHibernateServiceImpl implements CountryService{

    private final CountryRepository countryRepository;

    @Autowired
    private CountryMapper countryMapper;

    public CountryHibernateServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public CountryDto getByCountryId(Long countryId) {
        CountryEntity countryEntity = countryRepository.getCountryEntityByCountryId(countryId)
                .orElseThrow(()-> new RuntimeException("Страны с идентификатором %d не найдено".formatted(countryId)));
        return countryMapper.toDto(countryEntity);
    }

    public CountryDto getByName(String name) {
        CountryEntity countryEntity = countryRepository.findCountryEntityByName(name)
                .orElseThrow(()-> new RuntimeException("Страны с названием %s не найдено".formatted(name)));
        return countryMapper.toDto(countryEntity);
    }

    public List<CountryDto> getAll() {
        return countryMapper.toDto(countryRepository.findAll());
    }

}
