package com.disagreed.independentrepo.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 * Блюдо.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "dish")
public class DishEntity {

    @Id
    @Column(name = "dish_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dish_generator")
    @SequenceGenerator(name = "dish_generator", sequenceName = "dish_seq", allocationSize = 1)
    private Long dishId;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "description")
    private String description;

    @Column(name = "image")
    private String image;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private MenuEntity menu;

    @OneToOne
    @JoinColumn(name = "qualification_id")
    private QualificationEntity qualification;

    @OneToMany(mappedBy = "dish")
    private List<IngredientEntity> ingredientList;
}
