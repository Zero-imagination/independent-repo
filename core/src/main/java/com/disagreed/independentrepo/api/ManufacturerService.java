package com.disagreed.independentrepo.api;

import com.disagreed.independentrepo.dto.ManufacturerDto;

import java.util.List;

public interface ManufacturerService {

    List<ManufacturerDto> getAll();

    ManufacturerDto getByManufacturerId(Long manufacturerId);

}
