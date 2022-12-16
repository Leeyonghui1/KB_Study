create table mykbmajor(
name varchar2(30) not null,
code char(3) primary key,
regDate timestamp default sysdate
);

insert into mykbmajor(name,code) values('�����������','001');
insert into mykbmajor(name,code) values('������AI','002');

create table mykbstudent(
name varchar2(30),
age int,
hakbeon char(10),
hakgwacode char(3),
regDate timestamp default sysdate
);

alter table mykbstudent add CONSTRAINT fk_mykb foreign key(hakgwacode) references mykbmajor(code);
-- ������ ������ pk �߰�
alter table mykbstudent add CONSTRAINT mypk primary key(hakbeon);

insert into mykbstudent(name,age,hakbeon,hakgwacode) values('�̵���',40,'1234123412','001');
insert into mykbstudent(name,age,hakbeon,hakgwacode) values('�̿���',30,'1234123413','001');
insert into mykbstudent(name,age,hakbeon,hakgwacode) values('���¿�',20,'1234123414','002');

select * from mykbmajor;
select * from mykbstudent;

select mykbstudent.name, hakbeon, mykbmajor.name from mykbstudent
join mykbmajor on mykbstudent.hakgwacode=mykbmajor.code;

select mykbstudent.name, hakbeon, mykbmajor.name from mykbstudent
join mykbmajor on mykbstudent.hakgwacode=mykbmajor.code
where mykbmajor.name='������AI';

commit;
