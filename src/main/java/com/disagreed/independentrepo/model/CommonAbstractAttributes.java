package com.disagreed.independentrepo.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * Класс для общих параметров.
 */
@EqualsAndHashCode(callSuper = true)
@Data
@MappedSuperclass
public abstract class CommonAbstractAttributes extends BaseAbstractSystemAttributes{

    /**
     * Площадь.
     */
    @EqualsAndHashCode.Exclude
    @Column(name = "area")
    private Long area;

    /**
     * Население.
     */
    @EqualsAndHashCode.Exclude
    @Column(name = "population")
    private Long population;

    /**
     * Плотность населения чел./км^2.
     */
    @EqualsAndHashCode.Exclude
    @Column(name = "density")
    private Long density;

    /**
     * Координаты местоположения - ширина и долгота.
     */
    @EqualsAndHashCode.Exclude
    @Column(name = "coordinates")
    private String coordinates;
}
