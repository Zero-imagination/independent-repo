# independent-repo
Creating a repository that can work with both Hibernate and MyBatis

Используемые технологии: SpringBoot, Hibernate, MyBatis, Liquibase, Mapstruct, Lombok

Для реализаци репозитория Hibernate используется JpaRepository
Для реализации репозитория MyBatis используется интерфейс с аннотацией @Mapper и xml файлы мапперов

Для маппинга сущностей в дто и наоборот используется mapstruct

Для конвертации поля ActionIndicator используется класс ActionIndicatorEnumConverter с аннотацией jakarta.persistence.Converter

Для переключения между разными реализациями репозиториев используются классы IndependentRepository.
В конфигурационном файле application.yml в поле repository.name необходимо указать какой из репозиториев будет использован

Для сбора метрик используется prometheus, для отображения - grafana

---

### Для просмотра графиков откройте  [dashboard](http://localhost:3000/d/c68daf7a-43be-46eb-8f50-9e4968e7dd48/custom?orgId=1&from=now-15m&to=now&showCategory=Panel%20options) 

### Для запуска сервисов и отображения графиков выполните [запрос](./core/src/main/resources/http/startMeasure.http) </br> </br>

Данный рест вызывает следующий [controller](./core/src/main/java/com/disagreed/independentrepo/controller/measure/TestMeasureController.java)

Для генерации метрик по методам репозитория используется [profiler](./common-core/src/main/java/com/disagreed/independentrepo/profiler/RepositoryProfiler.java)

profiler сканирует все методы из [репозиториев](./common-core/src/main/java/com/disagreed/independentrepo/repository/impl)

---

Модель данных для ресторана (всего 12 уникальных сущностей)
```
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
```