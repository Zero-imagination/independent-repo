package com.disagreed.independentrepo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Квалификация для приготовления блюда.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QualificationDto {

    private Long qualificationId;

    private Long level;

    private String description;
}
