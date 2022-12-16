create table mydbhakgwa(
code char(3) primary key,
name varchar2(30)
);

create table mydbstudent(
hakbeon varchar2(10) primary key,
name varchar2(60),
age int,
hakgwacode char(3),
foreign key(hakgwacode) references mydbhakgwa(code)
);

insert into mydbhakgwa values('001','컴공');
insert into mydbhakgwa values('002','아동가족');

insert into mydbstudent values('0000000001','이동준',34,'001');
insert into mydbstudent values('0000000002','이제영',35,'002');
insert into mydbstudent values('0000000003','김혜민',24,'001');
insert into mydbstudent values('0000000004','이범식',44,'001');
insert into mydbstudent values('0000000005','박지호',14,'002');

select mydbstudent.name 학생명, hakbeon 학번, mydbhakgwa.name 학과명 
 from mydbstudent join mydbhakgwa on mydbstudent.hakgwacode=mydbhakgwa.code;

commit;