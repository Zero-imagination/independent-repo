package com.disagreed.independentrepo.model;

import lombok.EqualsAndHashCode;

/**
 * Класс для общих параметров.
 */
public abstract class CommonAbstractAttributes extends BaseAbstractSystemAttributes{

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
