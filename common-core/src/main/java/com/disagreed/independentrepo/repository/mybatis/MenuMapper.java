package com.disagreed.independentrepo.repository.mybatis;

import com.disagreed.independentrepo.model.entity.MenuEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Маппер mybatis для сущности MenuEntity.
 */
@Mapper
@Repository
public interface MenuMapper {

    /**
     * Получить информацию о меню по идентификатору.
     *
     * @param menuId идентификатор меню
     */
    Optional<MenuEntity> getByMenuId(@Param("menuId") Long menuId);

    /**
     * Получить все записи из таблицы menu.
     */
    List<MenuEntity> getAll();
}