package com.disagreed.independentrepo.service;

import com.disagreed.independentrepo.api.MenuService;
import com.disagreed.independentrepo.model.entity.MenuEntity;
import com.disagreed.independentrepo.repository.mybatis.MenuMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {

    private final MenuMapper menuMapper;
    @Override
    public List<MenuEntity> getAll() {
        return menuMapper.getAll();
    }

    @Override
    public MenuEntity getByMenuId(Long menuId) {
        return menuMapper.getByMenuId(menuId)
                .orElseThrow(()-> new RuntimeException("Меню с идентификатором %s не найдено"
                        .formatted(menuId)));
    }
}