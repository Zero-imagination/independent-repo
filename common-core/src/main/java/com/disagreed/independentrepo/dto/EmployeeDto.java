package com.disagreed.independentrepo.dto;

import com.disagreed.independentrepo.model.entity.EmployeeTypeEntity;
import com.disagreed.independentrepo.model.entity.PersonEntity;
import com.disagreed.independentrepo.model.entity.QualificationEntity;
import com.disagreed.independentrepo.model.entity.RestaurantEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

    private Long employeeId;

    private PersonEntity person;

    private EmployeeTypeEntity employeeType;

    private QualificationEntity qualification;

    private RestaurantEntity restaurant;
}
