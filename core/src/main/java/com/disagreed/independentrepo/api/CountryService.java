package com.disagreed.independentrepo.api;

import com.disagreed.independentrepo.dto.CountryDto;

import java.util.List;

public interface CountryService {

    CountryDto getByCountryId(Long countryId, Long typeCode);

    CountryDto getByName(String name);

    List<CountryDto> getAll(Long typeCode);

    Long getCountAll();

    Boolean exists(Long counryId);
}
