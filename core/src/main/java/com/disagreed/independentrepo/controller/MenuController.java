package com.disagreed.independentrepo.controller;

import com.disagreed.independentrepo.api.MenuService;
import com.disagreed.independentrepo.dto.MenuDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Контроллер для работы с меню.
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/menu", produces = MediaType.APPLICATION_JSON_VALUE)
public class MenuController {

    private final MenuService menuService;

    /**
     * Получить все записи из таблицы menu.
     */
    @GetMapping(value = "/all")
    public List<MenuDto> getAllMenu() {
        return menuService.getAll();
    }

    /**
     * Получить информацию о меню по его идентификатору.
     *
     * @param menuId идентификатор меню
     */
    @GetMapping(value = "/{menuId}")
    public MenuDto getByMenuId(@PathVariable Long menuId) {
        return menuService.getByMenuId(menuId);
    }
}