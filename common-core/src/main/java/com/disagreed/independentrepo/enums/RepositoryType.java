package com.disagreed.independentrepo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RepositoryType {

    HIBERNATE("hibernate", 0L),
    MYBATIS("mybatis", 1L);

    private final String serviceName;
    private final Long typeCode;

    public static String getServiceNameByTypeCode(Long typeCode) {
        for (RepositoryType repositoryType : values()) {
            if (repositoryType.typeCode.equals(typeCode)) {
                return repositoryType.serviceName;
            }
        }
        throw new RuntimeException("Для typeCode = %d не найден обработчик".formatted(typeCode));
    }
}