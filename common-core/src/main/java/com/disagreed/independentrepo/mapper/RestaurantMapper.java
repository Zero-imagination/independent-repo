package com.disagreed.independentrepo.mapper;

import com.disagreed.independentrepo.dto.RestaurantDto;
import com.disagreed.independentrepo.model.entity.RestaurantEntity;
import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.List;

@Mapper(componentModel = "spring")
public interface RestaurantMapper extends AbstractMapper<RestaurantEntity, RestaurantDto> {

    @Override
    RestaurantDto toDto(RestaurantEntity entity);

    /**
     * Метод для конвертации RestaurantEntity в RestaurantDto.
     */
    List<RestaurantDto> toDto(Collection<RestaurantEntity> entities);

    @Override
    RestaurantEntity toEntity(RestaurantDto dto);

    /**
     * Метод для конвертации RestaurantDto в RestaurantEntity.
     */
    List<RestaurantEntity> toEntity(Collection<RestaurantDto> dtos);

}
