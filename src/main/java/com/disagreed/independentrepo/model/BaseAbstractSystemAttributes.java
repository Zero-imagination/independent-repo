package com.disagreed.independentrepo.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

/**
 * Базовый класс для системных атрибутов таблиц.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class BaseAbstractSystemAttributes {

    /**
     * Дата время вставки записи в таблицу.
     * Column - create_dttm
     */
    @EqualsAndHashCode.Exclude
    @Column(name = "create_dttm", updatable = false)
    private OffsetDateTime createDttm = OffsetDateTime.now();

    /**
     * Дата время последнего изменения записи.
     * Column - modify_dttm
     */
    @EqualsAndHashCode.Exclude
    @Column(name = "modify_dttm")
    private OffsetDateTime modifyDttm = OffsetDateTime.now();

    /**
     * Индикатор операции DML(I-insert,D-delete,U-update).
     * Column - action_ind
     */
    @EqualsAndHashCode.Exclude
    @Column(name = "action_ind")
    private ActionIndicatorEnum actionInd = ActionIndicatorEnum.INSERT;

}
