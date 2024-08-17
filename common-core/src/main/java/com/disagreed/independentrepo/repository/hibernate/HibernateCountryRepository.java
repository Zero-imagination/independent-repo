package com.disagreed.independentrepo.repository.hibernate;

import com.disagreed.independentrepo.model.ActionIndicatorEnum;
import com.disagreed.independentrepo.model.entity.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Hibernate репозиторий для сущности CountryEntity.
 */
@Repository
public interface HibernateCountryRepository extends JpaRepository<CountryEntity, Long> {

    /**
     * Получить информацию о стране по его названию.
     *
     * @param name название страны
     */
    Optional<CountryEntity> findCountryEntityByName(String name);

    /**
     * Получить информацию о стране по её идентификатору.
     *
     * @param countryId идентификатор страны
     */
    Optional<CountryEntity> getCountryEntityByCountryId(Long countryId);

    /**
     * Получить количество всех записей из таблицы country.
     */
    Optional<Long> countCountryEntitiesByActionIndIsNotLike(ActionIndicatorEnum actionIndicatorEnum);
}
