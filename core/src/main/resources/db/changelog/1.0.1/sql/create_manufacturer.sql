create sequence if not exists manufacturer_seq start 1;

create table if not exists manufacturer
(
    manufacturer_id bigint       not null default nextval('manufacturer_seq' :: regclass),
    name            varchar(255) not null,
    description     text,
    city_id         bigint       not null,
    person_id       bigint       not null,

    constraint manufacturer_pk primary key (manufacturer_id),

    constraint city_manufacturer_fk foreign key (city_id)
        references city (city_id),

    constraint person_manufacturer_fk foreign key (person_id)
        references person (person_id)
);

create unique index if not exists manufacturer_manufacturer_id_uindex
    on manufacturer (manufacturer_id);

comment on table manufacturer is 'Производители ингредиентов';