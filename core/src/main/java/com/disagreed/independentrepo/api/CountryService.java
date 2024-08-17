package com.disagreed.independentrepo.api;

import com.disagreed.independentrepo.dto.CountryDto;

import java.util.List;

/**
 * Сервис CRUD операций для класса CountryDto.
 */
public interface CountryService {

    /**
     * Получить информацию о стране по её идентификатору.
     *
     * @param countryId идентификатор страны
     * @param typeCode идентификатор типа репозитория
     */
    CountryDto getByCountryId(Long countryId, Long typeCode);

    /**
     * Получить информацию о стране по его названию.
     *
     * @param name название страны
     */
    CountryDto getByName(String name);

    /**
     * Получить все записи из таблицы country.
     *
     * @param typeCode идентификатор типа репозитория
     */
    List<CountryDto> getAll(Long typeCode);

    /**
     * Получить количество всех записей из таблицы country.
     */
    Long getCountAll();

    /**
     * Проверить наличие записи в таблице country по идентификатору.
     *
     * @param countryId идентификатор страны
     */
    Boolean exists(Long countryId);
}
