package com.disagreed.independentrepo.controller;

import com.disagreed.independentrepo.dto.CityDto;
import com.disagreed.independentrepo.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/city", produces = MediaType.APPLICATION_JSON_VALUE)
public class CityController {

    private final CityService cityService;

    @GetMapping(value = "/all")
    public List<CityDto> getAllCity() {
        return cityService.getAll();
    }

    @PostMapping(value = "/all")
    public List<CityDto> getAllCityByCountryIds(@RequestBody List<Long> countryIds) {
        return cityService.getAllByCountryIds(countryIds);
    }

    @GetMapping(value = "/{cityId}")
    public CityDto getByCityId(@PathVariable Long cityId) {
        return cityService.getByCityId(cityId);
    }

    @GetMapping(value = "/name")
    public CityDto getByCityName(@RequestParam String name) {
        return cityService.getByName(name);
    }

    @PostMapping(value = "/save")
    public int saveCities(@RequestBody Collection<CityDto> cities) {
        return cityService.saveAll(cities);
    }

    @PutMapping(value = "/update")
    public int updateCities(@RequestBody Collection<CityDto> cities) {
        return cityService.updateAll(cities);
    }

    @DeleteMapping(value = "/delete")
    public int deleteCitiesByIds(@RequestBody List<Long> cityIds) {
        return cityService.markDeleteAll(cityIds);
    }
}
