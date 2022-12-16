create table mykbstudent (
hakbeon char(10) primary key,
name varchar2(30),
age char(2),
hakgwacode char(3),
time date default sysdate
);

create table mykbmajor(
hakgwacode char(3) primary key,
name varchar2(30),
time date default sysdate
);

alter table mykbstudent add CONSTRAINT fk_kb_code foreign key(hakgwacode) REFERENCES mykbmajor(hakgwacode);

insert into mykbmajor(hakgwacode,name) values('038','�����������');
insert into mykbmajor(hakgwacode,name) values('048','��ű������');

insert into mykbstudent(hakbeon,name,age,hakgwacode) values('2009038033','�̵���','40','038');
insert into mykbstudent values('2014187833','�̿���','20','048','22/08/01');
insert into mykbstudent(hakbeon,name,age,hakgwacode) values('2022081911','���¿�','30','038');

select * from mykbmajor;
select * from mykbstudent;

select mykbstudent.name �̸�, mykbstudent.hakbeon �й�, mykbmajor.name �а���
 from mykbstudent join mykbmajor on mykbstudent.hakgwacode=mykbmajor.hakgwacode;
 
 select mykbstudent.name �̸�, mykbstudent.hakbeon �й�, mykbmajor.name �а���
 from mykbstudent join mykbmajor on mykbstudent.hakgwacode=mykbmajor.hakgwacode
 where mykbstudent.hakgwacode='038';
 
 commit;