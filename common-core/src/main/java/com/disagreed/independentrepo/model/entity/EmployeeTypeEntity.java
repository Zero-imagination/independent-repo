package com.disagreed.independentrepo.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_type_generator")
    @SequenceGenerator(name = "employee_type_generator", sequenceName = "employee_type_seq", allocationSize = 1)
    private Long employeeTypeId;

    @Column(name = "name")
    private String name;
}
