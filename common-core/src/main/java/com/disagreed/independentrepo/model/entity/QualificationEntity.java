package com.disagreed.independentrepo.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Квалификация, требуемая для готовки блюда.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "qualification")
public class QualificationEntity {

    @Id
    @Column(name = "qualification_id")
    private Long qualificationId;

    private Long level;

    private String description;
}
