package com.disagreed.independentrepo.repository.hibernate;

import com.disagreed.independentrepo.model.entity.DishEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface HibernateDishRepository extends JpaRepository<DishEntity, Long> {

    @Query("select dish from DishEntity dish where dish.dishId=:id")
    Optional<DishEntity> findDishEntityById(@Param("id") Long dishId);
}
