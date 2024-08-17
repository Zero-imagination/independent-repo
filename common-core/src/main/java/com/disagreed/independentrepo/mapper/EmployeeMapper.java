package com.disagreed.independentrepo.mapper;

import com.disagreed.independentrepo.dto.EmployeeDto;
import com.disagreed.independentrepo.model.entity.EmployeeEntity;
import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeeMapper extends AbstractMapper<EmployeeEntity, EmployeeDto> {

    @Override
    EmployeeDto toDto(EmployeeEntity entity);

    /**
     * Метод для конвертации EmployeeEntity в EmployeeDto.
     */
    List<EmployeeDto> toDto(Collection<EmployeeEntity> entities);

    @Override
    EmployeeEntity toEntity(EmployeeDto dto);

    /**
     * Метод для конвертации EmployeeDto в EmployeeEntity.
     */
    List<EmployeeEntity> toEntity(Collection<EmployeeDto> dtos);

}
