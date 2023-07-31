package com.disagreed.independentrepo.service;

import com.disagreed.independentrepo.dto.CityDto;
import com.disagreed.independentrepo.mapper.CityMapper;
import com.disagreed.independentrepo.model.entity.CityEntity;
import com.disagreed.independentrepo.repository.hibernate.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityHibernateServiceImpl implements CityService {

    private final CityRepository cityRepository;

    @Autowired
    private CityMapper cityMapper;

    public CityHibernateServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public CityDto getByCityId(Long cityId) {
        CityEntity cityEntity = cityRepository.findCityEntityByCityId(cityId)
                .orElseThrow(()-> new RuntimeException("Города с идентификатором %s не найдено".formatted(cityId)));
        return cityMapper.toDto(cityEntity);
    }

    @Override
    public CityDto getByName(String name) {
        CityEntity cityEntity = cityRepository.findCityEntityByName(name)
                .orElseThrow(()-> new RuntimeException("Города с названием %s не найдено".formatted(name)));
        return cityMapper.toDto(cityEntity);
    }

    @Override
    public List<CityDto> getAll() {
        List<CityEntity> list = cityRepository.findAll();
        return cityMapper.toDto(list);
    }
}
