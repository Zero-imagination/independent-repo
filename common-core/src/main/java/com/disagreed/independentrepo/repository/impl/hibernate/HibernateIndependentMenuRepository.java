package com.disagreed.independentrepo.repository.impl.hibernate;

import com.disagreed.independentrepo.model.entity.MenuEntity;
import com.disagreed.independentrepo.repository.api.IndependentMenuRepository;
import com.disagreed.independentrepo.repository.hibernate.HibernateMenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@ConditionalOnProperty(value = "repository.name", havingValue = "hibernate")
public class HibernateIndependentMenuRepository implements IndependentMenuRepository {

    private final HibernateMenuRepository repository;

    @Override
    public List<MenuEntity> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<MenuEntity> getByMenuId(Long menuId) {
        return repository.findMenuEntityById(menuId);
    }
}
