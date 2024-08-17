package com.disagreed.independentrepo.api;

import com.disagreed.independentrepo.dto.EmployeeDto;

import java.util.List;

/**
 * Сервис CRUD операций для класса EmployeeDto.
 */
public interface EmployeeService {

    /**
     * Получить все записи из таблицы employee.
     */
    List<EmployeeDto> getAll();

    /**
     * Получить информацию о сотруднике по его идентификатору.
     *
     * @param employeeId идентификатор сотрудника
     */
    EmployeeDto getByEmployeeId(Long employeeId);
}
