package com.disagreed.independentrepo.api;

import com.disagreed.independentrepo.dto.MenuDto;

import java.util.List;

/**
 * Сервис CRUD операций для класса MenuDto.
 */
public interface MenuService {

    /**
     * Получить все записи из таблицы menu.
     */
    List<MenuDto> getAll();

    /**
     * Получить информацию о меню по его идентификатору.
     *
     * @param menuId идентификатор меню
     */
    MenuDto getByMenuId(Long menuId);
}