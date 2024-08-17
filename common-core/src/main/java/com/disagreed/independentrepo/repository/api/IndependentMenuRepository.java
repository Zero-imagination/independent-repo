package com.disagreed.independentrepo.repository.api;

import com.disagreed.independentrepo.model.entity.MenuEntity;

import java.util.List;
import java.util.Optional;

/**
 * Интерфейс CRUD операций для класса MenuEntity.
 */
public interface IndependentMenuRepository {

    /**
     * Получить все записи из таблицы menu.
     */
    List<MenuEntity> getAll();

    /**
     * Получить информацию о меню по его идентификатору.
     *
     * @param menuId идентификатор меню
     */
    Optional<MenuEntity> getByMenuId(Long menuId);
}
