package com.disagreed.independentrepo.controller;

import com.disagreed.independentrepo.dto.CityDto;
import com.disagreed.independentrepo.service.CityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {

    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping(value = "/all")
    public List<CityDto> getAllCity() {
        return cityService.getAll();
    }

    @GetMapping(value = "/{cityId}")
    public CityDto getByCityId(@PathVariable Long cityId) {
        return cityService.getByCityId(cityId);
    }

    @GetMapping(value = "/name")
    public CityDto getByCityId(@RequestParam String name) {
        return cityService.getByName(name);
    }
}
