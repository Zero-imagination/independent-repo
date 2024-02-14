package com.disagreed.independentrepo.repository.mybatis;

import com.disagreed.independentrepo.model.entity.EmployeeTypeEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Mapper
@Repository
public interface EmployeeTypeMapper {
    Optional<EmployeeTypeEntity> getByEmployeeTypeId(@Param("employeeTypeId") Long employeeTypeId);

    List<EmployeeTypeEntity> getAll();
}
