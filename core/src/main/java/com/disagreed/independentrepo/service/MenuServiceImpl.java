package com.disagreed.independentrepo.service;

import com.disagreed.independentrepo.api.MenuService;
import com.disagreed.independentrepo.dto.MenuDto;
import com.disagreed.independentrepo.mapper.MenuMapper;
import com.disagreed.independentrepo.repository.api.IndependentMenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {

    private final IndependentMenuRepository menuRepository;

    private final MenuMapper menuMapper;

    @Override
    public List<MenuDto> getAll() {
        return menuMapper.toDto(menuRepository.getAll());
    }

    @Override
    public MenuDto getByMenuId(Long menuId) {
        return menuRepository.getByMenuId(menuId)
                .map(menuMapper::toDto)
                .orElseThrow(()-> new RuntimeException("Меню с идентификатором %s не найдено"
                        .formatted(menuId)));
    }
}