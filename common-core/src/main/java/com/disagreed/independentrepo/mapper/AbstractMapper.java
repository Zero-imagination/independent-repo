package com.disagreed.independentrepo.mapper;

/**
 * Абстрактный маппер созданный как базовый класс для мапинга с использованием mapstruct.
 *
 * @param <D> объект для передачи во вне.
 * @param <E> внутрення сущность.
 */
public interface AbstractMapper<E, D> extends ToDtoMapper<E, D>, ToEntityMapper<E, D> {

}