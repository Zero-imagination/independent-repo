package com.disagreed.independentrepo.repository.mybatis;

import com.disagreed.independentrepo.model.entity.CategoryEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Маппер mybatis для сущности CategoryEntity.
 */
@Mapper
@Repository
public interface CategoryMapper {

    /**
     * Получить категорию меню по идентификатору.
     *
     * @param categoryId идентификатор категории
     */
    Optional<CategoryEntity> getByCategoryId(@Param("categoryId") Long categoryId);

    /**
     * Получить все записи из таблицы category.
     */
    List<CategoryEntity> getAll();
}