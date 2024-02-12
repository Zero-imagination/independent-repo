package com.disagreed.independentrepo.api;

import com.disagreed.independentrepo.dto.CountryDto;

import java.util.List;

public interface CountryService {

    CountryDto getByCountryId(Long countryId);

    CountryDto getByName(String name);

    List<CountryDto> getAll();

    Long getCountAll();

    Boolean exists(Long counryId);
}
