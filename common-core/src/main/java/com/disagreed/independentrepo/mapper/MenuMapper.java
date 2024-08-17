package com.disagreed.independentrepo.mapper;

import com.disagreed.independentrepo.dto.MenuDto;
import com.disagreed.independentrepo.model.entity.MenuEntity;
import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.List;

@Mapper(componentModel = "spring")
public interface MenuMapper extends AbstractMapper<MenuEntity, MenuDto> {

    @Override
    MenuDto toDto(MenuEntity entity);

    /**
     * Метод для конвертации MenuEntity в MenuDto.
     */
    List<MenuDto> toDto(Collection<MenuEntity> entities);

    @Override
    MenuEntity toEntity(MenuDto dto);

    /**
     * Метод для конвертации MenuDto в MenuEntity.
     */
    List<MenuEntity> toEntity(Collection<MenuDto> dtos);

}
