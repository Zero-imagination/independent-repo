package com.disagreed.independentrepo.repository.mybatis;

import com.disagreed.independentrepo.model.entity.EmployeeEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Mapper
@Repository
public interface EmployeeMapper {

    Optional<EmployeeEntity> getByEmployeeId(@Param("employeeId") Long employeeId);

    List<EmployeeEntity> getAll();
}
