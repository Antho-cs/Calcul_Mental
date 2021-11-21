create database expressions_polonaises_b3;

use expressions_polonaises_b3;

create table users(id int not null auto_increment primary key, login varchar(255) not null, hashed_passwd varchar(255) not null, constraint UC_Login unique (login));

insert into users(login, hashed_passwd) values ('Alex','9af9eef31e66682c7a4c3053e2f28007fd5f6ea4f2b668263ed2716fe4c793d8');

create user 'user_expressions_polonaises'@'localhost' identified by 'ep';

grant select, insert, update, delete on expressions_polonaises_b3.* to 'user_expressions_polonaises'@'localhost';