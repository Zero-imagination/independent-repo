create sequence if not exists qualification_seq start 1;

create table if not exists qualification
(
    qualification_id bigint not null default nextval('qualification' :: regclass),
    level            bigint not null,
    description      text,

    constraint qualification_pk primary key (qualification_id)
);

create unique index if not exists qualification_qualification_id_uindex
    on qualification (qualification_id);

comment on table qualification is 'Квалификация, необходимая для приготовления блюда';