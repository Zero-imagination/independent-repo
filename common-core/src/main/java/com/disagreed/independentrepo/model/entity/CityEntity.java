package com.disagreed.independentrepo.model.entity;

import com.disagreed.independentrepo.model.CommonAbstractAttributes;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
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
@Entity
@Table(name = "city")
public class CityEntity extends CommonAbstractAttributes {

    /**
     * Идентификатор БД.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "city_generator")
    @SequenceGenerator(name = "city_generator", sequenceName = "city_seq", allocationSize = 1)
    @Column(name = "city_id")
    private Long cityId;

    /**
     * Название города.
     */
    @Column(name = "name")
    private String name;

    /**
     * Является столицей
     */
    @Column(name = "is_capital")
    private boolean isCapital;

    /**
     * Сущность страны.
     */
    @OneToOne
    @JoinColumn(name = "country_id", referencedColumnName = "country_id")
    private CountryEntity country;

}
