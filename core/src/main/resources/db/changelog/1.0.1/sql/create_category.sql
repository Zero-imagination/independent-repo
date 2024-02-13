create sequence if not exists category_seq start 1;

create table if not exists category
(
    category_id bigint       not null default nextval('category_seq' :: regclass),
    name        varchar(128) not null,
    description text,

    constraint category_pk primary key (category_id)
);

create unique index if not exists category_category_id_uindex
    on category (category_id);

comment on table category is 'Категории меню';