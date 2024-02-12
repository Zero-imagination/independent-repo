package com.disagreed.independentrepo.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
    @Column(name = "restaurant_id")
    private Long restaurantId;

    private String name;

    private String address;

    @OneToMany(mappedBy = "restaurant")
    private List<EmployeeEntity> employeeList;

    @OneToMany(mappedBy = "restaurant")
    private List<MenuEntity> menuList;

}
