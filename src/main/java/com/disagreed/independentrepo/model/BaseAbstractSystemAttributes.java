package com.disagreed.independentrepo.model;

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
public abstract class BaseAbstractSystemAttributes {

    /**
     * Дата время вставки записи в таблицу.
     * Column - create_dttm
     */
    @EqualsAndHashCode.Exclude
    private OffsetDateTime createDttm;

    /**
     * Дата время последнего изменения записи.
     * Column - modify_dttm
     */
    @EqualsAndHashCode.Exclude
    private OffsetDateTime modifyDttm;

    /**
     * Индикатор операции DML(I-insert,D-delete,U-update).
     * Column - action_ind
     */
    @EqualsAndHashCode.Exclude
    private ActionIndicatorEnum actionInd;

}
