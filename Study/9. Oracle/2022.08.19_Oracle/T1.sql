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

insert into mydbhakgwa values('001','�İ�');
insert into mydbhakgwa values('002','�Ƶ�����');

insert into mydbstudent values('0000000001','�̵���',34,'001');
insert into mydbstudent values('0000000002','������',35,'002');
insert into mydbstudent values('0000000003','������',24,'001');
insert into mydbstudent values('0000000004','�̹���',44,'001');
insert into mydbstudent values('0000000005','����ȣ',14,'002');

select mydbstudent.name �л���, hakbeon �й�, mydbhakgwa.name �а��� 
 from mydbstudent join mydbhakgwa on mydbstudent.hakgwacode=mydbhakgwa.code;

commit;