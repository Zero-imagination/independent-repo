package com.disagreed.independentrepo.mapper;

import com.disagreed.independentrepo.dto.DishDto;
import com.disagreed.independentrepo.model.entity.DishEntity;
import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.List;

@Mapper(componentModel = "spring")
public interface DishMapper extends AbstractMapper<DishEntity, DishDto> {
    @Override
    DishDto toDto(DishEntity entity);

    @Override
    DishEntity toEntity(DishDto dto);

    List<DishEntity> toEntity(Collection<DishDto> dtos);

    List<DishDto> toDto(Collection<DishEntity> entities);
}
