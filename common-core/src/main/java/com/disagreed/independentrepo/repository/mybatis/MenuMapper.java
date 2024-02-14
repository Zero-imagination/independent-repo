package com.disagreed.independentrepo.repository.mybatis;


import com.disagreed.independentrepo.model.entity.MenuEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Mapper
@Repository
public interface MenuMapper {

    Optional<MenuEntity> getByMenuId(@Param("menuId") Long menuId);

    List<MenuEntity> getAll();
}