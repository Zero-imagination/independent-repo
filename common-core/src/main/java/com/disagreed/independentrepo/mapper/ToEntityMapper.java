package com.disagreed.independentrepo.mapper;

/**
 * Маппер для классов реализующих преборазование DTO в entity.
 *
 * @param <E>
 * @param <D>
 */
public interface ToEntityMapper<E, D> {

    /**
     * Преобразование к Entity.
     *
     * @param dto
     * @return
     */
    E toEntity(D dto);
}
