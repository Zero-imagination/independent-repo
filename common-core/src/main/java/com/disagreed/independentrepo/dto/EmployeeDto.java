package com.disagreed.independentrepo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

    private Long employeeId;

    private PersonDto person;

    private EmployeeTypeDto employeeType;

    private QualificationDto qualification;
}
