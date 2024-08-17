package com.disagreed.independentrepo.repository.mybatis;

import com.disagreed.independentrepo.model.entity.CountryEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Маппер mybatis для сущности CountryEntity.
 */
@Repository
@Mapper
public interface CountryMapper {

    /**
     * Получить информацию о стране по её идентификатору.
     *
     * @param countryId идентификатор страны
     */
    Optional<CountryEntity> getByCountryId(@Param("countryId") Long countryId);

    /**
     * Получить информацию о стране по его названию.
     *
     * @param name название страны
     */
    Optional<CountryEntity> getByName(@Param("name") String name);

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
