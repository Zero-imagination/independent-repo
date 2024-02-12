package com.disagreed.independentrepo.mapper;

import com.disagreed.independentrepo.dto.CountryDto;
import com.disagreed.independentrepo.model.entity.CountryEntity;
import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.List;

@Mapper(componentModel = "spring")
public interface CountryMapper extends AbstractMapper<CountryEntity, CountryDto> {

    @Override
    CountryEntity toEntity(CountryDto dto);

    @Override
    CountryDto toDto(CountryEntity entity);

    List<CountryEntity> toEntity(Collection<CountryDto> countryDtos);

    List<CountryDto> toDto(Collection<CountryEntity> countryEntities);

}
