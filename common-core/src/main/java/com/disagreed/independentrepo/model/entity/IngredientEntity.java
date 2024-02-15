package com.disagreed.independentrepo.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Ингредиент.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ingredient")
public class IngredientEntity {

    @Id
    @Column(name = "ingredient_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ingredient_generator")
    @SequenceGenerator(name = "ingredient_generator", sequenceName = "ingredient_seq", allocationSize = 1)
    private Long ingredientId;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "quantity")
    private Long quantity;

    @Column(name = "expiration_date")
    private LocalDate expirationDate;

    @Column(name = "description")
    private String description;

    @OneToOne
    @JoinColumn(name = "manufacturer_id")
    private ManufacturerEntity manufacturer;

    @ManyToOne
    @JoinColumn(name = "dish_id")
    private DishEntity dish;
}
