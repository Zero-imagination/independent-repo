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

    @Override
    EmployeeEntity toEntity(EmployeeDto dto);

    List<EmployeeEntity> toEntity(Collection<EmployeeDto> dtos);

    List<EmployeeDto> toDto(Collection<EmployeeEntity> entities);
}
