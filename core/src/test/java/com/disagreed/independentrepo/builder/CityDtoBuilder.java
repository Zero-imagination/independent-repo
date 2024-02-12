package com.disagreed.independentrepo.builder;

import com.disagreed.independentrepo.dto.CityDto;
import com.disagreed.independentrepo.dto.CountryDto;

public final class CityDtoBuilder {

    private Long cityId;

    private String name;

    private boolean isCapital;

    private Long area;

    private Long population;

    private Long density;

    private String coordinates;

    private CountryDto country;

    private CityDtoBuilder() {

    }

    public static CityDtoBuilder builder() {
        return new CityDtoBuilder();
    }

    public static CityDtoBuilder defaultObject() {
        CityDtoBuilder builder = new CityDtoBuilder();
        builder.name("Elsk")
                .cityId(100L)
                .isCapital(false)
                .area(400L)
                .population(10L)
                .density(40L)
                .coordinates("51,49 29,09")
                .country(getDefaultCountry());
        return builder;
    }

    private static CountryDto getDefaultCountry() {
        CountryDto countryDto = new CountryDto();
        countryDto.setCountryId(1L);
        countryDto.setName("France");
        countryDto.setNationalLanguage("French");
        return countryDto;
    }

    public CityDtoBuilder cityId(Long cityId) {
        this.cityId = cityId;
        return this;
    }

    public CityDtoBuilder name(String name) {
        this.name = name;
        return this;
    }

    public CityDtoBuilder isCapital(Boolean isCapital) {
        this.isCapital = isCapital;
        return this;
    }

    public CityDtoBuilder area(Long area) {
        this.area = area;
        return this;
    }

    public CityDtoBuilder population(Long population) {
        this.population = population;
        return this;
    }

    public CityDtoBuilder density(Long density) {
        this.density = density;
        return this;
    }

    public CityDtoBuilder coordinates(String coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    public CityDtoBuilder country(CountryDto country) {
        this.country = country;
        return this;
    }

    public CityDto build() {
        CityDto cityDto = new CityDto();
        cityDto.setCityId(cityId);
        cityDto.setName(name);
        cityDto.setCapital(isCapital);
        cityDto.setArea(area);
        cityDto.setPopulation(population);
        cityDto.setDensity(density);
        cityDto.setCoordinates(coordinates);
        cityDto.setCountry(country);
        return cityDto;
    }

}
