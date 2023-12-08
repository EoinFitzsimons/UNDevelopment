drop database if exists scoreDB;
create database scoreDB;
use scoreDB;

create table integrationsScore(
	ID int,
    userName varchar(20),
    score int
);

insert into integrationsScore values(10,"Jacob", 10);
insert into integrationsScore values(101,"Stewie", 0);
insert into integrationsScore values(12,"Lisa", 8);
insert into integrationsScore values(19,"Rachel", 1);
insert into integrationsScore values(11,"Ricky", 2);
insert into integrationsScore values(18,"Trevor", 9);
insert into integrationsScore values(14,"Corey", 3);



