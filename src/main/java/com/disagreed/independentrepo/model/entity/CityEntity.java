package com.disagreed.independentrepo.model.entity;

import com.disagreed.independentrepo.model.CommonAbstractAttributes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Сущность города.
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CityEntity extends CommonAbstractAttributes {

    /**
     * Идентификатор БД.
     */
    private Long cityId;

    /**
     * Название города.
     */
    private String name;

    /**
     * Сущность страны.
     */
    private CountryEntity country;

    /**
     * Является столицей
     */
    private boolean isCapital;

}
