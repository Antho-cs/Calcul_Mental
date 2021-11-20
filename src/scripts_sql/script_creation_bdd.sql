create database expressions_polonaises_b3;

use expressions_polonaises_b3;

create table user(id int not null primary key, login varchar(255) not null, hashed_passwd varchar(255) not null);