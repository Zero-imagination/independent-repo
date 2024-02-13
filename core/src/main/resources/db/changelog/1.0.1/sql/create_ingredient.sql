create sequence if not exists ingredient_seq start 1;

create table if not exists ingredient
(
    ingredient_id   bigint  not null default nextval('ingredient_seq' :: regclass),
    price           numeric not null,
    quantity        bigint  not null,
    expirationDate  date    not null,
    description     text,
    dish_id         bigint  not null,
    manufacturer_id bigint  not null,

    constraint manufacturer_ingredient_fk foreign key (manufacturer_id)
        references manufacturer (manufacturer_id),

    constraint dish_ingredient_fk foreign key (dish_id)
        references dish (dish_id)
);

create unique index if not exists ingredient_ingredient_id_uindex
    on ingredient (ingredient_id);

comment on table ingredient is 'Ингридиенты блюд';