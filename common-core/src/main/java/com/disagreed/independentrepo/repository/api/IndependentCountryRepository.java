package com.disagreed.independentrepo.repository.api;

import com.disagreed.independentrepo.model.entity.CountryEntity;

import java.util.List;
import java.util.Optional;

/**
 * Интерфейс CRUD операций для класса CountryEntity.
 */
public interface IndependentCountryRepository {

    /**
     * Получить информацию о стране по её идентификатору.
     *
     * @param countryId идентификатор страны
     */
    Optional<CountryEntity> getByCountryId(Long countryId);

    /**
     * Получить информацию о стране по его названию.
     *
     * @param name название страны
     */
    Optional<CountryEntity> getByName(String name);

    /**
     * Получить все записи из таблицы country.
     */
    List<CountryEntity> getAll();

    /**
     * Получить количество всех записей из таблицы country.
     */
    Optional<Long> countAll();

    /**
     * Проверить наличие записи в таблице country по идентификатору.
     *
     * @param countryId идентификатор страны
     */
    Boolean exists(Long countryId);

}
