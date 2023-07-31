package com.disagreed.independentrepo.service;

import com.disagreed.independentrepo.dto.CityDto;

import java.util.List;

public interface CityService {

    CityDto getByCityId(Long cityId);

    CityDto getByName(String name);

    List<CityDto> getAll();

}
