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

    /**
     * Метод для конвертации DishEntity в DishDto.
     */
    List<DishDto> toDto(Collection<DishEntity> entities);

    @Override
    DishEntity toEntity(DishDto dto);

    /**
     * Метод для конвертации DishDto в DishEntity.
     */
    List<DishEntity> toEntity(Collection<DishDto> dtos);

}
