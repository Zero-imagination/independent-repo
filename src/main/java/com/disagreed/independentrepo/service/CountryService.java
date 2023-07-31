package com.disagreed.independentrepo.service;

import com.disagreed.independentrepo.dto.CountryDto;

import java.util.List;

public interface CountryService {

    CountryDto getByCountryId(Long countryId);

    CountryDto getByName(String name);

    List<CountryDto> getAll();

    Long getCountAll();

}
