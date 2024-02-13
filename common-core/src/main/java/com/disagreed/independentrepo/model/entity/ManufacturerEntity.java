package com.disagreed.independentrepo.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Производитель ингредиента.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "manufacturer")
public class ManufacturerEntity {

    @Id
    @Column(name = "manufacturer_id")
    private Long manufacturerId;

    private String name;

    private String description;

    @OneToOne
    @JoinColumn(name = "city_id")
    private CityEntity city;

    @OneToOne
    @JoinColumn(name = "person_id")
    private PersonEntity person;
}
