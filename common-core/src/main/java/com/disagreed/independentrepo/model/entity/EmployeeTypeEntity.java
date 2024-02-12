package com.disagreed.independentrepo.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Тип работника ресторана.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee_type")
public class EmployeeTypeEntity {

    @Id
    @Column(name = "employee_type_id")
    private Long employeeTypeId;

    private String name;
}
