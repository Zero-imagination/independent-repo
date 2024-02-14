package com.disagreed.independentrepo.api;

import com.disagreed.independentrepo.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDto> getAll();

    EmployeeDto getByEmployeeId(Long employeeId);
}
