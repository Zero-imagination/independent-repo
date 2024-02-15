package com.disagreed.independentrepo.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Ресторан.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "restaurant")
public class RestaurantEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "restaurant_generator")
    @SequenceGenerator(name = "restaurant_generator", sequenceName = "restaurant_seq", allocationSize = 1)
    @Column(name = "restaurant_id")
    private Long restaurantId;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @OneToMany
    @JoinColumn(name = "restaurant_id")
    private List<EmployeeEntity> employeeList;

    @OneToMany
    @JoinColumn(name = "restaurant_id")
    private List<MenuEntity> menuList;

}
