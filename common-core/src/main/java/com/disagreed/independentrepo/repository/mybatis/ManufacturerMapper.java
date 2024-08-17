package com.disagreed.independentrepo.repository.mybatis;

import com.disagreed.independentrepo.model.entity.ManufacturerEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Маппер mybatis для сущности ManufacturerEntity.
 */
@Mapper
@Repository
public interface ManufacturerMapper {

    /**
     * Получить информацию о производителе по идентификатору.
     *
     * @param manufacturerId идентификатор производителя
     */
    Optional<ManufacturerEntity> getByManufacturerId(@Param("manufacturerId") Long manufacturerId);

    /**
     * Получить все записи из таблицы manufacturer.
     */
    List<ManufacturerEntity> getAll();

}
