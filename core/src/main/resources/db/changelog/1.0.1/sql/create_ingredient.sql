create sequence if not exists ingredient_seq start 1;

create table if not exists ingredient
(
    ingredient_id   bigint       not null default nextval('ingredient_seq' :: regclass),
    dish_id         bigint       not null,
    name            varchar(128) not null,
    description     text,
    quantity        bigint       not null,
    expiration_date date         not null,
    price           numeric      not null,
    manufacturer_id bigint       not null,

    constraint manufacturer_ingredient_fk foreign key (manufacturer_id)
        references manufacturer (manufacturer_id),

    constraint dish_ingredient_fk foreign key (dish_id)
        references dish (dish_id)
);

create unique index if not exists ingredient_ingredient_id_uindex
    on ingredient (ingredient_id);

comment on table ingredient is 'Ингридиенты блюд';