package com.disagreed.independentrepo.repository.impl.mybatis;

import com.disagreed.independentrepo.model.entity.MenuEntity;
import com.disagreed.independentrepo.repository.api.IndependentMenuRepository;
import com.disagreed.independentrepo.repository.mybatis.MenuMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@ConditionalOnProperty(value = "repository.name", havingValue = "mybatis")
public class MybatisIndependentMenuRepository implements IndependentMenuRepository {

    private final MenuMapper repository;

    @Override
    public List<MenuEntity> getAll() {
        return repository.getAll();
    }

    @Override
    public Optional<MenuEntity> getByMenuId(Long menuId) {
        return repository.getByMenuId(menuId);
    }
}
