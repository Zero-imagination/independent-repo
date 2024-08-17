package com.disagreed.independentrepo.controller;

import com.disagreed.independentrepo.dto.CityDto;
import com.disagreed.independentrepo.api.CityService;
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

/**
 * Контроллер для работы с городами.
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/city", produces = MediaType.APPLICATION_JSON_VALUE)
public class CityController {

    private final CityService cityService;

    /**
     * Получить все записи из таблицы city.
     */
    @GetMapping(value = "/all")
    public List<CityDto> getAllCity() {
        return cityService.getAll();
    }

    /**
     * Получить все города по указанным идентификаторам.
     *
     * @param countryIds идентификаторы городов.
     */
    @PostMapping(value = "/all")
    public List<CityDto> getAllCityByCountryIds(@RequestBody List<Long> countryIds) {
        return cityService.getAllByCountryIds(countryIds);
    }

    /**
     * Получить информацию о городе по его идентификатору.
     *
     * @param cityId идентификатор города
     */
    @GetMapping(value = "/{cityId}")
    public CityDto getByCityId(@PathVariable Long cityId) {
        return cityService.getByCityId(cityId);
    }

    /**
     * Получить город по его названию.
     *
     * @param name название города
     */
    @GetMapping(value = "/name")
    public CityDto getByCityName(@RequestParam String name) {
        return cityService.getByName(name);
    }

    /**
     * Сохранить информацию о городах.
     *
     * @param cities список городов
     */
    @PostMapping(value = "/save")
    public int saveCities(@RequestBody Collection<CityDto> cities) {
        return cityService.saveAll(cities);
    }

    /**
     * Обновить информацию о городах.
     *
     * @param cities список городов
     */
    @PutMapping(value = "/update")
    public int updateCities(@RequestBody Collection<CityDto> cities) {
        return cityService.updateAll(cities);
    }

    /**
     * Пометить удаленными города по их идентификаторам.
     *
     * @param cityIds список идентификаторов городов
     */
    @DeleteMapping(value = "/delete")
    public int deleteCitiesByIds(@RequestBody List<Long> cityIds) {
        return cityService.markDeleteAll(cityIds);
    }
}
