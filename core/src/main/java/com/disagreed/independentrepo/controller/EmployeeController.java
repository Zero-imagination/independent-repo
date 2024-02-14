package com.disagreed.independentrepo.controller;

import com.disagreed.independentrepo.api.EmployeeService;
import com.disagreed.independentrepo.model.entity.EmployeeEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/employee", produces = MediaType.APPLICATION_JSON_VALUE)
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping(value = "/all")
    public List<EmployeeEntity> getAllEmployee() {
        return employeeService.getAll();
    }

    @GetMapping(value = "/{employeeId}")
    public EmployeeEntity getByEmployeeId(@PathVariable Long employeeId) {
        return employeeService.getByEmployeeId(employeeId);
    }
}
