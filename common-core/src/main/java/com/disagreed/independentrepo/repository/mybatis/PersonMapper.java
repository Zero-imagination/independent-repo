package com.disagreed.independentrepo.repository.mybatis;

import com.disagreed.independentrepo.model.entity.PersonEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Маппер mybatis для сущности PersonEntity.
 */
@Mapper
@Repository
public interface PersonMapper {

    /**
     * Получить данные человека по идентификатору.
     *
     * @param personId идентификатор данных человека
     */
    Optional<PersonEntity> getByPersonId(@Param("personId") Long personId);

    /**
     * Получить все записи из таблицы person.
     */
    List<PersonEntity> getAll();

}
