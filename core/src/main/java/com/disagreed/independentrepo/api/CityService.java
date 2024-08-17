package com.disagreed.independentrepo.api;

import com.disagreed.independentrepo.dto.CityDto;

import java.util.Collection;
import java.util.List;

/**
 * Сервис CRUD операций для класса CityDto.
 */
public interface CityService {

    /**
     * Сохранить информацию о городах.
     *
     * @param cities список городов
     */
    int saveAll(Collection<CityDto> cities);

    /**
     * Обновить информацию о городах.
     *
     * @param cities список городов
     */
    int updateAll(Collection<CityDto> cities);

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
    CityDto getByCityId(Long cityId);

    /**
     * Получить город по его названию.
     *
     * @param name название города
     */
    CityDto getByName(String name);

    /**
     * Получить все записи из таблицы city.
     */
    List<CityDto> getAll();

    /**
     * Получить все города по указанным идентификаторам.
     *
     * @param countryIds идентификаторы городов.
     */
    List<CityDto> getAllByCountryIds(Collection<Long> countryIds);

}
