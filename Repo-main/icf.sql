create database if not exists icf;
use icf;
drop table if exists Dependents;
drop table if exists EducationalQualification;
drop table if exists Employee ;

create table Employee
(id varchar(10) primary key, firstname varchar(30),lastname varchar(30),
employeeid varchar(10) not null, startdate date,designation varchar(30), departement varchar(20),
enddate date,status varchar(20),dob date,reportingmanager varchar(30), gender varchar(1),
bloodgroup varchar(6), address varchar(50)
);
create table Dependents
( id varchar(10), firstname varchar(30), lastname varchar(30), gender varchar(1), dob date,
relationship varchar(20),
foreign key (id) references Employee(id)
);
 
create table EducationalQualification
 ( id varchar(10),type varchar(10), startdate date,enddate date,Institution varchar(30),
 address varchar(50), percentage float(3,2)
 check(percentage<=100),
 foreign key (id) references Employee(id)
 );
 
 insert into Employee values
 ("123","John","Wick","789","2015-02-12",
 "developer","GlobalTech",null,"working","1994-12-25",
 "Thor","M","b+ve","stark towers");
  insert into Employee values
 ("124","Tony","Stark","789","2017-02-12",
 "developer","InterSys","2020-12-24","released","1994-12-25",
 "Hulk","M","o+ve","avenger towers");
   insert into Employee values
 ("125","Black","Widow","789","2020-02-12",
 "developer","InterSys","2020-12-24","onboarded","1994-12-25",
 "Thor","M","ab+ve","sea towers");
 
 select * from Employee;


