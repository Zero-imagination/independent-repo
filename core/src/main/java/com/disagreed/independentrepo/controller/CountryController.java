package com.disagreed.independentrepo.controller;

import com.disagreed.independentrepo.dto.CountryDto;
import com.disagreed.independentrepo.api.CountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping(value = "/all")
    public List<CountryDto> getAllCountry(@RequestParam(defaultValue = "0") Long typeCode) {
        return countryService.getAll(typeCode);
    }

    @GetMapping(value = "/{countryId}")
    public CountryDto getByCountryId(@PathVariable Long countryId,
                                     @RequestParam(defaultValue = "0") Long typeCode) {
        return countryService.getByCountryId(countryId, typeCode);
    }

    @GetMapping(value = "/name")
    public CountryDto getByName(@RequestParam String name) {
        return countryService.getByName(name);
    }

    @GetMapping(value = "/countAll")
    public Long getCountAll() {
        return countryService.getCountAll();
    }
}
