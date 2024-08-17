package com.disagreed.independentrepo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Тип сотрудника.
 * (пример: Повар)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeTypeDto {

    private Long employeeTypeId;

    private String name;
}
