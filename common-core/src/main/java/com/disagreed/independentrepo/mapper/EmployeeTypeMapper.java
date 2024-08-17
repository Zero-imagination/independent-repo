package com.disagreed.independentrepo.mapper;

import com.disagreed.independentrepo.dto.EmployeeTypeDto;
import com.disagreed.independentrepo.model.entity.EmployeeTypeEntity;
import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeeTypeMapper extends AbstractMapper<EmployeeTypeEntity, EmployeeTypeDto> {

    @Override
    EmployeeTypeDto toDto(EmployeeTypeEntity entity);

    /**
     * Метод для конвертации EmployeeTypeEntity в EmployeeTypeDto.
     */
    List<EmployeeTypeDto> toDto(Collection<EmployeeTypeEntity> entities);

    @Override
    EmployeeTypeEntity toEntity(EmployeeTypeDto dto);

    /**
     * Метод для конвертации EmployeeTypeDto в EmployeeTypeEntity.
     */
    List<EmployeeTypeEntity> toEntity(Collection<EmployeeTypeDto> dtos);

}
