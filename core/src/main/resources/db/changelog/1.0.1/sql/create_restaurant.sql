create sequence if not exists restaurant_seq start 1;

create table if not exists restaurant
(
    restaurant_id bigint       not null default nextval('restaurant_seq' :: regclass),
    name          varchar(128) not null,
    address       text         not null,

    constraint restaurant_pk primary key (restaurant_id)
);

create unique index if not exists restaurant_restaurant_id_uindex
    on restaurant (restaurant_id);

comment on table restaurant is 'Ресторан';