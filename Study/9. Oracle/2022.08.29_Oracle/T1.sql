delete from food;
select * from food;

-- 1.
insert into food values(1,'��ġ�',8000);
insert into food values(2,'�����',7000);
insert into food values(3,'Į����',null);
insert into food values(4,'����',15000);
insert into food values(5,'��ġ��',5000);
insert into food values(6,'������',7000);
insert into food values(7,'�ܹ���',null);
insert into food values(8,'������ġ�',11000);
insert into food values(9,'��ġ�Ľ�Ÿ',13000);
insert into food values(10,'��������',9000);

-- 2.
select * from food where name like '%��ġ%';


-- 3.
select * from food where price between 5000 and 7000;


-- 4.
update food set price = 1000 where price is null;


-- 5.
update food set name = '���ִ� �Ұ��' where num = 1;
