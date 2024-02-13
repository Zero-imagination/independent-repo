create sequence if not exists employee_seq start 1;

create table if not exists employee
(
    employee_id      bigint not null default nextval('employee_seq' :: regclass),
    person_id        bigint not null,
    employee_type_id bigint not null,
    qualification_id bigint not null,
    restaurant_id    bigint not null,

    constraint employee_pk primary key (employee_id),

    constraint person_employee_fk foreign key (person_id)
        references person (person_id),

    constraint employee_type_employee_fk foreign key (employee_type_id)
        references employee_type (employee_type_id),

    constraint qualification_employee_fk foreign key (qualification_id)
        references qualification (qualification_id),

    constraint restaurant_employee_fk foreign key (restaurant_id)
        references restaurant (restaurant_id)
);

create unique index if not exists employee_employee_id_uindex
    on employee (employee_id);

comment on table employee is 'Работник ресторана';