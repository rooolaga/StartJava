create database "Jaegers";

create table Jaegers (
    id        integer primary key,
    modelName varchar(50),
    mark      varchar(50),
    height    int,
    weight    int,
    status    varchar(50),
    origin    varchar(50),
    launch    date,
    kaijuKill int
);
