create sequence if not exists country_seq start 1;

create table if not exists country
(
    country_id bigint not null default nextval('country_seq' :: regclass),
    name              varchar(128) not null,
    national_language varchar(128),
    area              bigint       not null,
    population        bigint       not null,
    density           real         not null,
    coordinates       varchar(128) not null,
    create_dttm       timestamptz not null default current_timestamp,
    modify_dttm       timestamptz not null default current_timestamp,
    action_ind        varchar(1) not null default 'I',

    constraint country_pk primary key (country_id)
);

comment on table country is 'Таблица стран';

comment on column country.country_id is 'Идентификатор';

comment on column country.name is 'Название страны';

comment on column country.national_language is 'Национальный язык';

comment on column country.area is 'Площадь';

comment on column country.population is 'Население';

comment on column country.density is 'Плотность населения чел./км^2';

comment on column country.coordinates is 'Координаты местоположения';

comment on column country.create_dttm is 'Дата время вставки записи в таблицу';

comment on column country.modify_dttm is 'Дата время последнего изменения записи';

comment on column country.action_ind is 'Индикатор операции DML (I-insert, D-delete, U-update)';

create unique index if not exists country_country_id_uindex
    on country (country_id);