create database universe;
grant all on universe.* to spring identified by 'spring';
use universe;

drop table if exists planets;
create table planets (
planet_id int(11) primary key,
name varchar(255) not null
);

insert into planets (planet_id, name) values (1, 'Mercury');
insert into planets (planet_id, name) values (2, 'Venus');
insert into planets (planet_id, name) values (3, 'Earth');
insert into planets (planet_id, name) values (4, 'Mars');
insert into planets (planet_id, name) values (5, 'Jupiter');
insert into planets (planet_id, name) values (6, 'Saturn');
insert into planets (planet_id, name) values (7, 'Uranus');
insert into planets (planet_id, name) values (8, 'Neptune');

select * from planets;