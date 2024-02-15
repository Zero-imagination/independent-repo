package com.disagreed.independentrepo.repository.hibernate;

import com.disagreed.independentrepo.model.entity.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HibernateMenuRepository extends JpaRepository<MenuEntity, Long> {

    @Query("select menu from MenuEntity menu where menu.menuId=:id")
    Optional<MenuEntity> findMenuEntityById(@Param("id") Long menuId);
}
