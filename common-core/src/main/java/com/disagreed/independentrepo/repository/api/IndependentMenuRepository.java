package com.disagreed.independentrepo.repository.api;

import com.disagreed.independentrepo.model.entity.MenuEntity;

import java.util.List;
import java.util.Optional;

public interface IndependentMenuRepository {

    List<MenuEntity> getAll();

    Optional<MenuEntity> getByMenuId(Long menuId);
}
