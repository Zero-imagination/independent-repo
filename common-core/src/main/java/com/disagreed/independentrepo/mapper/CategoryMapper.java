package com.disagreed.independentrepo.mapper;

import com.disagreed.independentrepo.dto.CategoryDto;
import com.disagreed.independentrepo.model.entity.CategoryEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper extends AbstractMapper<CategoryEntity, CategoryDto> {
}
