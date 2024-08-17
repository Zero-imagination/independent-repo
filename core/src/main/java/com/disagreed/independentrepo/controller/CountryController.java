package com.disagreed.independentrepo.controller;

import com.disagreed.independentrepo.dto.CountryDto;
import com.disagreed.independentrepo.api.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Контроллер для работы со странами.
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/country")
public class CountryController {

    private final CountryService countryService;

    /**
     * Получить все записи из таблицы country.
     *
     * @param typeCode идентификатор типа репозитория
     */
    @GetMapping(value = "/all")
    public List<CountryDto> getAllCountry(@RequestParam(defaultValue = "0") Long typeCode) {
        return countryService.getAll(typeCode);
    }

    /**
     * Получить информацию о стране по её идентификатору.
     *
     * @param countryId идентификатор страны
     * @param typeCode идентификатор типа репозитория
     */
    @GetMapping(value = "/{countryId}")
    public CountryDto getByCountryId(@PathVariable Long countryId,
                                     @RequestParam(defaultValue = "0") Long typeCode) {
        return countryService.getByCountryId(countryId, typeCode);
    }

    /**
     * Получить информацию о стране по его названию.
     *
     * @param name название страны
     */
    @GetMapping(value = "/name")
    public CountryDto getByName(@RequestParam String name) {
        return countryService.getByName(name);
    }

    /**
     * Получить количество всех записей из таблицы country.
     */
    @GetMapping(value = "/countAll")
    public Long getCountAll() {
        return countryService.getCountAll();
    }
}
