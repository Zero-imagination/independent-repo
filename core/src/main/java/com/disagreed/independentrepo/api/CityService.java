package com.disagreed.independentrepo.api;

import com.disagreed.independentrepo.dto.CityDto;

import java.util.Collection;
import java.util.List;

public interface CityService {

    int saveAll(Collection<CityDto> cities);

    int updateAll(Collection<CityDto> cities);

    int markDeleteAll(Collection<Long> ids);

    CityDto getByCityId(Long cityId);

    CityDto getByName(String name);

    List<CityDto> getAll();

    List<CityDto> getAllByCountryIds(Collection<Long> countryIds);

}
