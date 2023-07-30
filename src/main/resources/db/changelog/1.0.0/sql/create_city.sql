create sequence if not exists city_seq start 1;

create table if not exists city
(
    city_id bigint not null default nextval('city_seq' :: regclass),
    name varchar(128) not null,
    country_id bigint not null,
    is_capital bool not null,
    area              bigint       not null,
    population        bigint       not null,
    density           real         not null,
    coordinates       varchar(128) not null,
    create_dttm       timestamptz not null default current_timestamp,
    modify_dttm       timestamptz not null default current_timestamp,
    action_ind        varchar(1) not null default 'I',

    constraint city_pk primary key (city_id)
);

alter table if exists city
    add constraint city_country_fk foreign key (country_id)
        references country (country_id);

create unique index if not exists city_city_id_uindex
    on city (city_id);

comment on table city is 'Таблица городов';

comment on column city.city_id is 'Идентификатор города';

comment on column city.name is 'Название города';

comment on column city.country_id is 'Идентификатор страны в которой находиться город';

comment on column city.is_capital is 'Является ли столицей';

comment on column city.area is 'Площадь';

comment on column city.population is 'Население';

comment on column city.density is 'Плотность населения чел./км^2';

comment on column city.coordinates is 'Координаты местоположения';

comment on column city.create_dttm is 'Дата время вставки записи в таблицу';

comment on column city.modify_dttm is 'Дата время последнего изменения записи';

comment on column city.action_ind is 'Индикатор операции DML (I-insert, D-delete, U-update)';




