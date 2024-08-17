package com.disagreed.independentrepo.api;

import com.disagreed.independentrepo.dto.ManufacturerDto;

import java.util.List;

/**
 * Сервис CRUD операций для класса ManufacturerDto.
 */
public interface ManufacturerService {

    /**
     * Получить все записи из таблицы manufacturer.
     */
    List<ManufacturerDto> getAll();

    /**
     * Получить информацию о производителе по идентификатору.
     *
     * @param manufacturerId идентификатор производителя
     */
    ManufacturerDto getByManufacturerId(Long manufacturerId);

}
