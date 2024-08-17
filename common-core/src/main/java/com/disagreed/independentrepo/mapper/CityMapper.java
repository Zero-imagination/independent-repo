package com.disagreed.independentrepo.mapper;

import com.disagreed.independentrepo.dto.CityDto;
import com.disagreed.independentrepo.model.entity.CityEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Collection;
import java.util.List;

@Mapper(componentModel = "spring", uses = CountryMapper.class)
public interface CityMapper extends AbstractMapper<CityEntity, CityDto> {

    @Override
    @Mapping(target = "createDttm", ignore = true)
    @Mapping(target = "modifyDttm", ignore = true)
    @Mapping(target = "actionInd", ignore = true)
    CityEntity toEntity(CityDto dto);

    /**
     * Метод для конвертации CityDto в CityEntity.
     */
    List<CityEntity> toEntity(Collection<CityDto> cityDtos);

    @Override
    CityDto toDto(CityEntity entity);

    /**
     * Метод для конвертации CityEntity в CityDto.
     */
    List<CityDto> toDto(Collection<CityEntity> cityEntities);

}
