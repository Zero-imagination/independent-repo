# independent-repo
Creating a repository that can work with both Hibernate and MyBatis

Используемые технологии: SpringBoot, Hibernate, MyBatis, Liquibase, Mapstruct, Lombok

Две модели данных: Страна, Город
При этом Страна является одним из параметров Города

Для реализаци репозитория Hibernate используется JpaRepository
Для реализации репозитория MyBatis используется интерфейс с аннотацией @Mapper
(примечание: реализовать маппера mybatis через xml файлы не получилось, в чем ошибка не нашел)

Для маппинга сущностей в дто и наоборот используется mupstruct

Для конвертации поля ActionIndicator используется класс ActionIndicatorEnumConverter с аннотацией jakarta.persistence.Converter

Для переключения между разными реализациями репозиториев используются классы IndependentRepository.
В конфигурационном файле application.yml в поле repository.name необходимо указать какой из репозиториев будет использован
