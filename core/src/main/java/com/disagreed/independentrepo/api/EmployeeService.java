package com.disagreed.independentrepo.api;

import com.disagreed.independentrepo.model.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    List<EmployeeEntity> getAll();

    EmployeeEntity getByEmployeeId(Long employeeId);
}
