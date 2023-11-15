CREATE TABLE IF NOT EXISTS book
(
    isbn             varchar(17)              primary key,
    name             text                     not null,
    author           text,
    published        timestamp with time zone,
    created          timestamp with time zone not null,
    updated          timestamp with time zone
);
