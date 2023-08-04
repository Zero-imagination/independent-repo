package com.disagreed.independentrepo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CityDto {

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
    private CountryDto country;

    /**
     * Является столицей
     */
    private boolean isCapital;

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
