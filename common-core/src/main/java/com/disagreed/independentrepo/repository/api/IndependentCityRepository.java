package com.disagreed.independentrepo.repository.api;

import com.disagreed.independentrepo.model.entity.CityEntity;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

/**
 * Интерфейс CRUD операций для класса CityEntity.
 */
public interface IndependentCityRepository {

    /**
     * Сохранить информацию о городах.
     *
     * @param cities список городов
     */
    int saveAll(Collection<CityEntity> cities);

    /**
     * Обновить информацию о городах.
     *
     * @param cities список городов
     */
    int updateAll(Collection<CityEntity> cities);

    /**
     * Пометить удаленными города по их идентификаторам.
     *
     * @param ids список идентификаторов городов
     */
    int markDeleteAll(Collection<Long> ids);

    /**
     * Получить информацию о городе по его идентификатору.
     *
     * @param cityId идентификатор города
     */
    Optional<CityEntity> getByCityId(Long cityId);

    /**
     * Получить город по его названию.
     *
     * @param name название города
     */
    Optional<CityEntity> getByName(String name);

    /**
     * Получить все записи из таблицы city.
     */
    List<CityEntity> getAll();

    /**
     * Получить все города по указанным идентификаторам.
     *
     * @param countryIds идентификаторы городов.
     */
    List<CityEntity> getAllByCountryIds(Collection<Long> countryIds);

}
