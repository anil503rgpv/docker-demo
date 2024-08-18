CREATE TABLE if not exists employee
(
    id            integer,
    name    varchar(250),
    age           integer,
    designation   varchar(250),
    phone_number  varchar(250),
    date_of_birth date,
    created_at timestamp,
    updated_at timestamp,
    PRIMARY KEY (id)
);