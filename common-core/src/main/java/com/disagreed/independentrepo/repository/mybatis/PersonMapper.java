package com.disagreed.independentrepo.repository.mybatis;

import com.disagreed.independentrepo.model.entity.PersonEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Mapper
@Repository
public interface PersonMapper {

    Optional<PersonEntity> getByPersonId(@Param("personId") Long personId);

    List<PersonEntity> getAll();

}
