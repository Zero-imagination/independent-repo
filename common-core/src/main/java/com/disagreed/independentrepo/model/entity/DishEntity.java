package com.disagreed.independentrepo.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
    private Long dishId;

    private String name;

    private BigDecimal price;

    private String description;

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
