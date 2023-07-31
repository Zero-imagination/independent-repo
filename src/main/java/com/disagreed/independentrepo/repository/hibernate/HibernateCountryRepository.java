package com.disagreed.independentrepo.repository.hibernate;

import com.disagreed.independentrepo.model.ActionIndicatorEnum;
import com.disagreed.independentrepo.model.entity.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HibernateCountryRepository extends JpaRepository<CountryEntity, Long> {

    Optional<CountryEntity> findCountryEntityByName(String name);

    Optional<CountryEntity> getCountryEntityByCountryId(Long countryId);

    Optional<Long> countCountryEntitiesByActionIndIsNotLike(ActionIndicatorEnum actionIndicatorEnum);
}
