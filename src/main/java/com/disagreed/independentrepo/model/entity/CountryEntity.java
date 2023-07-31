package com.disagreed.independentrepo.model.entity;

import com.disagreed.independentrepo.model.CommonAbstractAttributes;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Entity
@Table(name = "country")
public class CountryEntity extends CommonAbstractAttributes {

    /**
     * Идентификатор страны в БД
     */
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "country_id")
    private Long countryId;

    /**
     * Название.
     */
    @Column(name = "name")
    private String name;

    /**
     * Национальный язык.
     */
    @Column(name = "national_language")
    private String nationalLanguage;

}
