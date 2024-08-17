package com.disagreed.independentrepo.repository.mybatis;

import com.disagreed.independentrepo.model.entity.EmployeeEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Маппер mybatis для сущности EmployeeEntity.
 */
@Mapper
@Repository
public interface EmployeeMapper {

    /**
     * Получить информацию о сотруднике по его идентификатору.
     *
     * @param employeeId идентификатор сотрудника
     */
    Optional<EmployeeEntity> getByEmployeeId(@Param("employeeId") Long employeeId);

    /**
     * Получить все записи из таблицы employee.
     */
    List<EmployeeEntity> getAll();
}
