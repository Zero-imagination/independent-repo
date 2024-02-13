create sequence if not exists menu_seq start 1;

create table if not exists menu
(
    menu_id       bigint       not null default nextval('menu_seq' :: regclass),
    name          varchar(128) not null,
    description   text,
    category_id   bigint       not null,
    restaurant_id bigint       not null,

    constraint menu_pk primary key (menu_id),

    constraint restaurant_menu_fk foreign key (restaurant_id)
        references restaurant (restaurant_id),

    constraint category_menu_fk foreign key (category_id)
        references category (category_id)
);

create unique index if not exists menu_menu_id_uindex
    on menu (menu_id);

comment on table menu is 'Меню ресторана';