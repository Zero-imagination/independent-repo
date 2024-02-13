package com.disagreed.independentrepo.service;

import com.disagreed.independentrepo.api.ManufacturerService;
import com.disagreed.independentrepo.model.entity.ManufacturerEntity;
import com.disagreed.independentrepo.repository.mybatis.ManufacturerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ManufacturerServiceImpl implements ManufacturerService {

    private final ManufacturerMapper manufacturerRepository;

    @Override
    public List<ManufacturerEntity> getAll() {
        return manufacturerRepository.getAll();
    }

    @Override
    public ManufacturerEntity getByManufacturerId(Long manufacturerId) {
        return null;
    }
}
