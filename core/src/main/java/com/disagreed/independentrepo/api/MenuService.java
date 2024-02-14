package com.disagreed.independentrepo.api;

import com.disagreed.independentrepo.dto.MenuDto;

import java.util.List;

public interface MenuService {

    List<MenuDto> getAll();

    MenuDto getByMenuId(Long menuId);
}