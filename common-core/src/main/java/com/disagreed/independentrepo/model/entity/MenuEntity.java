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

import java.util.List;

/**
 * Меню ресторана.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "menu")
public class MenuEntity {

    @Id
    @Column(name = "menu_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "menu_generator")
    @SequenceGenerator(name = "menu_generator", sequenceName = "menu_seq", allocationSize = 1)
    private Long menuId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @OneToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;

    @OneToMany(mappedBy = "menu")
    private List<DishEntity> dishList;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private RestaurantEntity restaurant;

}
