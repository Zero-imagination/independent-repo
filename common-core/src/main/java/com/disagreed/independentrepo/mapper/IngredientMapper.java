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

    @Override
    IngredientEntity toEntity(IngredientDto dto);

    List<IngredientEntity> toEntity(Collection<IngredientDto> dtos);

    List<IngredientDto> toDto(Collection<IngredientEntity> entities);
}
