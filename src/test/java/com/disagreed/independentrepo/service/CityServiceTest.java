package com.disagreed.independentrepo.service;

import com.disagreed.independentrepo.builder.CityDtoBuilder;
import com.disagreed.independentrepo.dto.CityDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public abstract class CityServiceTest {

    @Autowired
    private CityServiceImpl cityService;

    @Test
    void when_saveAll_should_getByName() {
        //подготовка
        CityDto firstExpectedCityDto = CityDtoBuilder.defaultObject()
                .name("test1")
                .build();
        CityDto secondExpectedCityDto = CityDtoBuilder.defaultObject()
                .name("test2")
                .build();

        //действие
        cityService.saveAll(List.of(firstExpectedCityDto, secondExpectedCityDto));
        CityDto firstActualCityDto = cityService.getByName(firstExpectedCityDto.getName());
        CityDto secondActualCityDto = cityService.getByName(secondExpectedCityDto.getName());

        //проверка
        assertEquals(firstExpectedCityDto, firstActualCityDto);
        assertEquals(secondExpectedCityDto, secondActualCityDto);
    }

    @Test
    void when_getByCityId_should_updateAll_and_getByName() {
        //подготовка
        Long cityId = 1L;
        String newName = "NewName";
        CityDto expectedCityDto = cityService.getByCityId(cityId);
        expectedCityDto.setName(newName);

        //действие
        cityService.updateAll(List.of(expectedCityDto));
        CityDto actualCityDto = cityService.getByName(expectedCityDto.getName());

        //проверка
        assertEquals(expectedCityDto, actualCityDto);
    }

    @Test
    void when_markDeleteAll_and_getByCityId_should_throwRuntimeException() {
        //подготовка
        Long cityId = 2L;
        CityDto expectedCityDto = cityService.getByCityId(cityId);

        //действие
        cityService.markDeleteAll(List.of(expectedCityDto.getCityId()));

        //проверка
        RuntimeException thrown = Assertions.assertThrows(RuntimeException.class, () -> cityService.getByCityId(cityId));
        assertTrue(thrown.getMessage().contains("Города с идентификатором %s не найдено".formatted(cityId)));
    }

    @Test
    void when_markDeleteAll_and_getByName_should_throwRuntimeException() {
        //подготовка
        Long cityId = 3L;
        CityDto expectedCityDto = cityService.getByCityId(cityId);
        String cityName = expectedCityDto.getName();

        //действие
        cityService.markDeleteAll(List.of(expectedCityDto.getCityId()));

        //проверка
        RuntimeException thrown = Assertions.assertThrows(RuntimeException.class, () -> cityService.getByName(cityName));
        assertTrue(thrown.getMessage().contains("Города с названием %s не найдено".formatted(cityName)));
    }

}