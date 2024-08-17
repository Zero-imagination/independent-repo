package com.disagreed.independentrepo.repository.mybatis;

import com.disagreed.independentrepo.model.entity.CityEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

/**
 * Маппер mybatis для сущности CityEntity.
 */
@Mapper
@Repository
public interface CityMapper {

    /**
     * Сохранить информацию о городах.
     *
     * @param cities список городов
     */
    int saveAll(@Param("cities") Collection<CityEntity> cities);

    /**
     * Обновить информацию о городах.
     *
     * @param cities список городов
     */
    int updateAll(@Param("cities") Collection<CityEntity> cities);

    /**
     * Пометить удаленными города по их идентификаторам.
     *
     * @param ids список идентификаторов городов
     */
    int markDeleteAll(@Param("ids") Collection<Long> ids);

    /**
     * Получить город по его названию.
     *
     * @param name название города
     */
    Optional<CityEntity> getByName(@Param("name") String name);

    /**
     * Получить информацию о городе по его идентификатору.
     *
     * @param cityId идентификатор города
     */
    Optional<CityEntity> getByCityId(@Param("cityId") Long cityId);

    /**
     * Получить все записи из таблицы city.
     */
    List<CityEntity> getAll();

    /**
     * Получить все города по указанным идентификаторам.
     *
     * @param countryIds идентификаторы городов.
     */
    List<CityEntity> getAllByCountryIds(@Param("countryIds") Collection<Long> countryIds);

}
