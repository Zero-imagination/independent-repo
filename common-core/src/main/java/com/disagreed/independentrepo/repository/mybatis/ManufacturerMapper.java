package com.disagreed.independentrepo.repository.mybatis;

import com.disagreed.independentrepo.model.entity.ManufacturerEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Mapper
@Repository
public interface ManufacturerMapper {

    Optional<ManufacturerEntity> getByManufacturerId(@Param("manufacturerId") Long manufacturerId);

    List<ManufacturerEntity> getAll();

}
