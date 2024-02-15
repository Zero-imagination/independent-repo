package com.disagreed.independentrepo.repository.hibernate;

import com.disagreed.independentrepo.model.entity.IngredientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface HibernateIngredientRepository extends JpaRepository<IngredientEntity, Long> {

    @Query("select ingredient from IngredientEntity ingredient where ingredient.ingredientId=:id")
    Optional<IngredientEntity> findIngredientEntityById(@Param("id") Long ingredientId);
}
