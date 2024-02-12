package com.disagreed.independentrepo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Модель данных страны
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountryDto {

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

    /**
     * Площадь.
     */
    @EqualsAndHashCode.Exclude
    private Long area;

    /**
     * Население.
     */
    @EqualsAndHashCode.Exclude
    private Long population;

    /**
     * Плотность населения чел./км^2.
     */
    @EqualsAndHashCode.Exclude
    private Long density;

    /**
     * Координаты местоположения - ширина и долгота.
     */
    @EqualsAndHashCode.Exclude
    private String coordinates;

}
