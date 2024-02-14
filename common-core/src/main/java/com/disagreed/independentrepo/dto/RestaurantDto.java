package com.disagreed.independentrepo.dto;

import com.disagreed.independentrepo.model.entity.EmployeeEntity;
import com.disagreed.independentrepo.model.entity.MenuEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantDto {

    private Long restaurantId;

    private String name;

    private String address;

    private List<EmployeeEntity> employeeList;

    private List<MenuEntity> menuList;
}
