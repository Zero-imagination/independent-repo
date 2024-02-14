package com.disagreed.independentrepo.controller;

import com.disagreed.independentrepo.api.MenuService;
import com.disagreed.independentrepo.model.entity.MenuEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/menu", produces = MediaType.APPLICATION_JSON_VALUE)
public class MenuController {

    private final MenuService menuService;

    @GetMapping(value = "/all")
    public List<MenuEntity> getAllMenu() {
        return menuService.getAll();
    }

    @GetMapping(value = "/{menuId}")
    public MenuEntity getByMenuId(@PathVariable Long menuId) {
        return menuService.getByMenuId(menuId);
    }
}