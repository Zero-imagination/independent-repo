package com.disagreed.independentrepo.mapper;

import com.disagreed.independentrepo.dto.ManufacturerDto;
import com.disagreed.independentrepo.model.entity.ManufacturerEntity;
import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.List;

@Mapper(componentModel = "spring")
public interface ManufacturerMapper extends AbstractMapper<ManufacturerEntity, ManufacturerDto> {
    @Override
    ManufacturerDto toDto(ManufacturerEntity entity);

    @Override
    ManufacturerEntity toEntity(ManufacturerDto dto);

    List<ManufacturerEntity> toEntity(Collection<ManufacturerDto> dtos);

    List<ManufacturerDto> toDto(Collection<ManufacturerEntity> entities);
}
