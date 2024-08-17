package com.disagreed.independentrepo.repository.mybatis;

import com.disagreed.independentrepo.model.entity.EmployeeTypeEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Маппер mybatis для сущности EmployeeTypeEntity.
 */
@Mapper
@Repository
public interface EmployeeTypeMapper {

    /**
     * Получить информацию о типе сотруднике по идентификатору.
     *
     * @param employeeTypeId идентификатор типа сотрудника
     */
    Optional<EmployeeTypeEntity> getByEmployeeTypeId(@Param("employeeTypeId") Long employeeTypeId);

    /**
     * Получить все записи из таблицы employee_type.
     */
    List<EmployeeTypeEntity> getAll();
}
