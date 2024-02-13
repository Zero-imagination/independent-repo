create sequence if not exists dish_seq start 1;

create table if not exists dish
(
    dish_id          bigint  not null default nextval('dish_seq' :: regclass),
    price            numeric not null,
    description      text,
    image            text,
    qualification_id bigint  not null,
    menu_id          bigint  not null,

    constraint dish_pk primary key (dish_id),

    constraint qualification_dish_fk foreign key (qualification_id)
        references qualification (qualification_id),

    constraint menu_dish_fk foreign key (menu_id)
        references menu (menu_id)
);

create unique index if not exists dish_dish_id_uindex
    on dish (dish_id);

comment on table dish is 'Блюда';