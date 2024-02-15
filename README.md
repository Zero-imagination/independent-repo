# independent-repo
Creating a repository that can work with both Hibernate and MyBatis

Используемые технологии: SpringBoot, Hibernate, MyBatis, Liquibase, Mapstruct, Lombok

Для реализаци репозитория Hibernate используется JpaRepository
Для реализации репозитория MyBatis используется интерфейс с аннотацией @Mapper и xml файлы мапперов

Для маппинга сущностей в дто и наоборот используется mupstruct

Для конвертации поля ActionIndicator используется класс ActionIndicatorEnumConverter с аннотацией jakarta.persistence.Converter

Для переключения между разными реализациями репозиториев используются классы IndependentRepository.
В конфигурационном файле application.yml в поле repository.name необходимо указать какой из репозиториев будет использован

Модель данных для ресторана (всего 12 уникальных сущностей)
    Restaurant:
    -> Emploee:
        -> Person
        -> EmployeeType
        -> Qualification
    -> Menu:
        -> Category
        -> Dish:
            -> Qualification
            -> Ingredients:
                -> Manufacturer:
                    -> Person
                    -> City:
                        -> Country