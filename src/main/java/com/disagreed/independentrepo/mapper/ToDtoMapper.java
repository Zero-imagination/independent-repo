package com.disagreed.independentrepo.mapper;

/**
 * Маппер для классов реализующих преборазование DTO в entity и обратно.
 *
 * @param <E>
 * @param <D>
 */
public interface ToDtoMapper<E, D> {

    /**
     * Преобразование к DTO.
     *
     * @param entity
     * @return
     */
    D toDto(E entity);
}
