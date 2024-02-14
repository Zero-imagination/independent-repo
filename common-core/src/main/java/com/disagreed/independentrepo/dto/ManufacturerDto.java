package com.disagreed.independentrepo.dto;

import com.disagreed.independentrepo.model.entity.CityEntity;
import com.disagreed.independentrepo.model.entity.PersonEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ManufacturerDto {

    private Long manufacturerId;

    private String name;

    private String description;

    private CityEntity city;

    private PersonEntity person;
}
