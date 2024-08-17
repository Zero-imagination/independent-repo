package com.disagreed.independentrepo.repository.mybatis;

import com.disagreed.independentrepo.model.entity.QualificationEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Маппер mybatis для сущности QualificationEntity.
 */
@Mapper
@Repository
public interface QualificationMapper {

    /**
     * Получить квалификацию по идентификатору.
     *
     * @param qualificationId идентификатор квалификации
     */
    Optional<QualificationEntity> getByQualificationId(@Param("qualificationId") Long qualificationId);

    /**
     * Получить все записи из таблицы qualification.
     */
    List<QualificationEntity> getAll();
}
