package com.disagreed.independentrepo.controller;

import com.disagreed.independentrepo.api.EmployeeService;
import com.disagreed.independentrepo.dto.EmployeeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Контроллер для работы с сотрудниками.
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/employee", produces = MediaType.APPLICATION_JSON_VALUE)
public class EmployeeController {

    private final EmployeeService employeeService;

    /**
     * Получить все записи из таблицы employee.
     */
    @GetMapping(value = "/all")
    public List<EmployeeDto> getAllEmployee() {
        return employeeService.getAll();
    }

    /**
     * Получить информацию о сотруднике по его идентификатору.
     *
     * @param employeeId идентификатор сотрудника
     */
    @GetMapping(value = "/{employeeId}")
    public EmployeeDto getByEmployeeId(@PathVariable Long employeeId) {
        return employeeService.getByEmployeeId(employeeId);
    }
}
