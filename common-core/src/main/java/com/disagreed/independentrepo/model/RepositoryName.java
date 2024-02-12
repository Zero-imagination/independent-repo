package com.disagreed.independentrepo.model;

public enum RepositoryName {

    HIBERNATE("hibernate"),

    MYBATIS("mybatis");

    private final String name;

    RepositoryName(String name) {this.name = name;}

    public String getName() {
        return name;
    }
}
