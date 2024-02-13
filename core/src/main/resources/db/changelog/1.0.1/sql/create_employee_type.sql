create sequence if not exists employee_type_seq start 1;

create table if not exists employee_type
(
    employee_type_id bigint       not null default nextval('employee_type_seq' :: regclass),
    name             varchar(128) not null,

    constraint employee_type_pk primary key (employee_type_id)
);

create unique index if not exists employee_type_employee_type_id_uindex
    on employee_type (employee_type_id);

comment on table employee_type is 'Тип работника ресторана';