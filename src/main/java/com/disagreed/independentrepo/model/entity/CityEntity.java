package com.disagreed.independentrepo.model.entity;

import com.disagreed.independentrepo.model.CommonAbstractAttributes;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
    @GeneratedValue(strategy = GenerationType.TABLE)
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
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "country_id", referencedColumnName = "country_id")
    private CountryEntity country;

}
