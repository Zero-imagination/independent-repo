package com.disagreed.independentrepo.repository.mybatis;

import com.disagreed.independentrepo.model.entity.QualificationEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Mapper
@Repository
public interface QualificationMapper {

    Optional<QualificationEntity> getByQualificationId(@Param("qualificationId") Long qualificationId);

    List<QualificationEntity> getAll();
}
