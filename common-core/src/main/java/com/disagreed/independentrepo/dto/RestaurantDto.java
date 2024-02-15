package com.disagreed.independentrepo.dto;

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

    private List<EmployeeDto> employeeList;

    private List<MenuDto> menuList;
}
