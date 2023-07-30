package com.disagreed.independentrepo.model.entity;

import com.disagreed.independentrepo.model.CommonAbstractAttributes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Сущность страны.
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountryEntity extends CommonAbstractAttributes {

    /**
     * Идентификатор страны в БД
     */
    private Long countryId;

    /**
     * Название.
     */
    private String name;

    /**
     * Национальный язык.
     */
    private String nationalLanguage;

}
