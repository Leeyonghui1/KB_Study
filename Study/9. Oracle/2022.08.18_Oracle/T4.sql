
create table samsumgpeople
(id number primary key, name varchar2(20), check_id number,
foreign key(check_id) references samsumgpeople(id));

insert into samsumgpeople(id,name) values(1,'�̰���');
insert into samsumgpeople(id,name) values(2,'ȫ����');
insert into samsumgpeople(id,name) values(3,'�̺���');
insert into samsumgpeople(id,name) values(4,'�����');
insert into samsumgpeople(id,name) values(5,'�Ŷ�ȣ��');
insert into samsumgpeople(id,name) values(6,'�Ｚ����');
insert into samsumgpeople(id,name) values(7,'�����Ｚ');
insert into samsumgpeople(id,name) values(8,'�Ｚ���̿���');
select * from samsumgpeople;

update samsumgpeople set check_id=1 where id=1;
update samsumgpeople set check_id=1 where id>2 and id<=4;
update samsumgpeople set check_id=3 where id=5;
update samsumgpeople set check_id=4 where id>5 and id<=8;
commit;

select x1.name "BOSS", x2.name "NAME" from samsumgpeople x1 join samsumgpeople x2 on x1.id=x2.check_id;