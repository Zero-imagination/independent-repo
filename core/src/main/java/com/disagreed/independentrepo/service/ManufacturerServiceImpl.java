package com.disagreed.independentrepo.service;

import com.disagreed.independentrepo.api.ManufacturerService;
import com.disagreed.independentrepo.dto.ManufacturerDto;
import com.disagreed.independentrepo.model.entity.ManufacturerEntity;
import com.disagreed.independentrepo.repository.mybatis.ManufacturerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ManufacturerServiceImpl implements ManufacturerService {

    private final ManufacturerMapper manufacturerRepository;

    private final com.disagreed.independentrepo.mapper.ManufacturerMapper manufacturerMapper;

    @Override
    public List<ManufacturerDto> getAll() {
        return manufacturerMapper.toDto(manufacturerRepository.getAll());
    }

    @Override
    public ManufacturerDto getByManufacturerId(Long manufacturerId) {
        return manufacturerRepository.getByManufacturerId(manufacturerId)
                .map(manufacturerMapper::toDto)
                .orElseThrow(()-> new RuntimeException("Производителя с идентификатором %s не найдено"
                        .formatted(manufacturerId)));
    }
}
