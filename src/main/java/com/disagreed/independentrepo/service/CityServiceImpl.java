package com.disagreed.independentrepo.service;

import com.disagreed.independentrepo.dto.CityDto;
import com.disagreed.independentrepo.mapper.CityMapper;
import com.disagreed.independentrepo.model.entity.CityEntity;
import com.disagreed.independentrepo.repository.api.IndependentCityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {

    private final IndependentCityRepository cityRepository;

    private final CityMapper cityMapper;

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
}