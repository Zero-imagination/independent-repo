package com.disagreed.independentrepo.controller;

import com.disagreed.independentrepo.api.ManufacturerService;
import com.disagreed.independentrepo.dto.ManufacturerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Контроллер для работы с производителями.
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/manufacturer", produces = MediaType.APPLICATION_JSON_VALUE)
public class ManufacturerController {

    private final ManufacturerService manufacturerService;

    /**
     * Получить все записи из таблицы manufacturer.
     */
    @GetMapping(value = "/all")
    public List<ManufacturerDto> getAllManufacturer() {
        return manufacturerService.getAll();
    }

    /**
     * Получить информацию о производителе по идентификатору.
     *
     * @param manufacturerId идентификатор производителя
     */
    @GetMapping(value = "/{manufacturerId}")
    public ManufacturerDto getByManufacturerId(@PathVariable Long manufacturerId) {
        return manufacturerService.getByManufacturerId(manufacturerId);
    }
}
