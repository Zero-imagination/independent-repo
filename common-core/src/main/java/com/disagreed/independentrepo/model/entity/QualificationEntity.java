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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "qualification_generator")
    @SequenceGenerator(name = "qualification_generator", sequenceName = "qualification_seq", allocationSize = 1)
    private Long qualificationId;

    @Column(name = "level")
    private Long level;

    @Column(name = "description")
    private String description;
}
