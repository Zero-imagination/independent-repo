package com.disagreed.independentrepo.service;

import com.disagreed.independentrepo.api.CityService;
import com.disagreed.independentrepo.api.CountryService;
import com.disagreed.independentrepo.dto.CityDto;
import com.disagreed.independentrepo.dto.CountryDto;
import com.disagreed.independentrepo.mapper.CityMapper;
import com.disagreed.independentrepo.model.entity.CityEntity;
import com.disagreed.independentrepo.repository.api.IndependentCityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {

    private static final String BASE_ERROR_CITY_MESSAGE = "Невозможно сохранить, причина:";

    private final IndependentCityRepository cityRepository;

    private final CountryService countryService;

    private final CityMapper cityMapper;

    @Transactional
    @Override
    public int saveAll(Collection<CityDto> cities) {
        validateCities(cities);
        return cityRepository.saveAll(cityMapper.toEntity(cities));
    }

    @Transactional
    @Override
    public int updateAll(Collection<CityDto> cities) {
        validateCities(cities);
        return cityRepository.updateAll(cityMapper.toEntity(cities));
    }

    @Transactional
    @Override
    public int markDeleteAll(Collection<Long> ids) {
        return cityRepository.markDeleteAll(ids);
    }

    @Override
    public CityDto getByCityId(Long cityId) {
        CityEntity cityEntity = cityRepository.getByCityId(cityId)
                .orElseThrow(()-> new RuntimeException("Города с идентификатором %s не найдено".formatted(cityId)));
        return cityMapper.toDto(cityEntity);
    }

    @Override
    public CityDto getByName(String name) {
        CityEntity cityEntity = cityRepository.getByName(name)
                .orElseThrow(()-> new RuntimeException("Города с названием %s не найдено".formatted(name)));
        return cityMapper.toDto(cityEntity);
    }

    @Override
    public List<CityDto> getAll() {
        List<CityEntity> list = cityRepository.getAll();
        return cityMapper.toDto(list);
    }

    @Override
    public List<CityDto> getAllByCountryIds(Collection<Long> countryIds) {
        List<CityEntity> list = cityRepository.getAllByCountryIds(countryIds);
        if (list.isEmpty()) {
            throw new RuntimeException(
                    "Не найдено ни одного города для следующих идентификаторов стран: %s".formatted(countryIds));
        }
        return cityMapper.toDto(list);
    }

    private void validateCities(Collection<CityDto> cities) {
        if (Objects.isNull(cities) || cities.isEmpty()) {
            throw new RuntimeException("%s cities = %s".formatted(BASE_ERROR_CITY_MESSAGE, cities));
        }
        cities.stream()
                .filter(Objects::nonNull)
                .map(CityDto::getCountry)
                .filter(Objects::nonNull)
                .map(CountryDto::getCountryId)
                .forEach(countryId -> {
                    if (!countryService.exists(countryId)) {
                        throw new RuntimeException("%s не существует страны с идентификатором %s".formatted(
                                BASE_ERROR_CITY_MESSAGE, countryId));
                    }
                });
    }
}
