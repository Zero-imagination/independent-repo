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

    /**
     * Метод для конвертации ManufacturerEntity в ManufacturerDto.
     */
    List<ManufacturerDto> toDto(Collection<ManufacturerEntity> entities);

    @Override
    ManufacturerEntity toEntity(ManufacturerDto dto);

    /**
     * Метод для конвертации ManufacturerDto в ManufacturerEntity.
     */
    List<ManufacturerEntity> toEntity(Collection<ManufacturerDto> dtos);

}
