create sequence if not exists person_seq start 1;

create table if not exists person
(
    person_id     bigint       not null default nextval('person_seq' :: regclass),
    first_name    varchar(128) not null,
    last_name     varchar(128) not null,
    middle_name   varchar(128) not null,
    contact_phone varchar(128) not null,

    constraint person_pk primary key (person_id)
);

create unique index if not exists person_person_id_uindex
    on person (person_id);

comment on table person is 'Контактные данные человека';