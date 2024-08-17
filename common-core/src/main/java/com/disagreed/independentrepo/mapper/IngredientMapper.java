package com.disagreed.independentrepo.mapper;

import com.disagreed.independentrepo.dto.IngredientDto;
import com.disagreed.independentrepo.model.entity.IngredientEntity;
import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.List;

@Mapper(componentModel = "spring")
public interface IngredientMapper extends AbstractMapper<IngredientEntity, IngredientDto> {

    @Override
    IngredientDto toDto(IngredientEntity entity);

    /**
     * Метод для конвертации IngredientEntity в IngredientDto.
     */
    List<IngredientDto> toDto(Collection<IngredientEntity> entities);

    @Override
    IngredientEntity toEntity(IngredientDto dto);

    /**
     * Метод для конвертации IngredientDto в IngredientEntity.
     */
    List<IngredientEntity> toEntity(Collection<IngredientDto> dtos);

}
