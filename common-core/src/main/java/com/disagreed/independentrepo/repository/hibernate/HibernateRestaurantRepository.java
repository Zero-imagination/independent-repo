package com.disagreed.independentrepo.repository.hibernate;

import com.disagreed.independentrepo.model.entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HibernateRestaurantRepository extends JpaRepository<RestaurantEntity, Long> {

    @Query("select restaurant from RestaurantEntity restaurant where restaurant.restaurantId=:id")
    Optional<RestaurantEntity> findRestaurantEntityById(@Param("id") Long restaurantId);

}