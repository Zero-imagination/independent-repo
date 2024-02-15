package com.disagreed.independentrepo.dto;

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

    private CityDto city;

    private PersonDto person;
}
