package com.disagreed.independentrepo.model.entity;

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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "manufacturer_generator")
    @SequenceGenerator(name = "manufacturer_generator", sequenceName = "manufacturer_seq", allocationSize = 1)
    private Long manufacturerId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @OneToOne
    @JoinColumn(name = "city_id")
    private CityEntity city;

    @OneToOne
    @JoinColumn(name = "person_id")
    private PersonEntity person;
}
