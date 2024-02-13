package com.disagreed.independentrepo.api;

import com.disagreed.independentrepo.model.entity.ManufacturerEntity;

import java.util.List;

public interface ManufacturerService {

    List<ManufacturerEntity> getAll();

    ManufacturerEntity getByManufacturerId(Long manufacturerId);

}
