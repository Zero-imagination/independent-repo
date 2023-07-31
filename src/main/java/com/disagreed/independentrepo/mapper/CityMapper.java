package com.disagreed.independentrepo.mapper;

import com.disagreed.independentrepo.dto.CityDto;
import com.disagreed.independentrepo.model.entity.CityEntity;
import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.List;

@Mapper(componentModel = "spring", uses = CountryMapper.class)
public interface CityMapper extends AbstractMapper<CityEntity, CityDto> {

    @Override
    CityEntity toEntity(CityDto dto);

    @Override
    CityDto toDto(CityEntity entity);

    List<CityEntity> toEntity(Collection<CityDto> cityDtos);

    List<CityDto> toDto(Collection<CityEntity> cityEntities);

}
