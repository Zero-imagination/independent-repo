package com.disagreed.independentrepo.api;

import com.disagreed.independentrepo.model.entity.MenuEntity;

import java.util.List;

public interface MenuService {

    List<MenuEntity> getAll();

    MenuEntity getByMenuId(Long menuId);
}