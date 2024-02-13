package com.disagreed.independentrepo.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Данные человека.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "person")
public class PersonEntity {

    @Id
    @Column(name = "person_id")
    private Long personId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "contact_phone")
    private Long contactPhone;
}
