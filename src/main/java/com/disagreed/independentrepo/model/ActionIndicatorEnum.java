package com.disagreed.independentrepo.model;

/**
 * Перечисление значений для индикатор операции DML.
 */
public enum ActionIndicatorEnum {

    /**
     * Индикатор обновления записи.
     */
    UPDATE("U"),

    /**
     * Индикатор вставки записи.
     */
    INSERT("I"),

    /**
     * Индикатор удаления записи.
     */
    DELETE("D");

    private final String action;

    ActionIndicatorEnum(String action) {
        this.action = action;
    }

    /**
     * Получить буквенный индикатор.
     *
     * @return индикатор
     */
    public String getAction() {
        return action;
    }
}
