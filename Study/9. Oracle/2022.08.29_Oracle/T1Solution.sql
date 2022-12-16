delete from food;
select * from food;

-- 1. ���� 10�� �߰�
insert into food(num,name,price) values(7,'��������',30000);
insert into food(num,name,price) values(8,'�Ұ�ⱸ��',50000);
insert into food values(9,'������',15000);
insert into food(num,price,name) values(10,9000,'���ﵤ��');
insert into food(num,name) values(11,'�����ħ');
insert into food(num,name,price) values(12,'��Ʈ���ڵ���',null);
insert into food values(13,'�Ͽ��̾��������� ���ξ���','');
insert into food values(14,'�����ʹ�',12000);
insert into food values(15,'�����',5000);
insert into food values(16,'��������',8000);

select * from food order by num;
select * from food order by price desc;
select * from food where price is not null;
select * from food where price is not null order by price desc;


-- 2. �޴��̸��� ��ġ ���°͸�
select * from food where name like '%��ġ%';

-- 3. ���� 5000~7000 �����ΰ͸�
select * from food where price >= 5000 and price <= 7000;

-- 4. ���ݵ����Ͱ� null �� �����ϱ�
update food set price = 1000 where price is null;

-- 5. num=1 �޴��̸� ����
update food set name = '���ִ� �Ұ��' where num = 1;

select * from food;
commit;

show autocommit;

-- rollback ���ǻ���
-- 1. rollback�� ���� �ֱ� commit�������� ���ư�
-- 2. autocommit ����� �����ִٸ� rollback �ȸ��� why? �߰� ���� �����Ҷ����� commit�ϱ� ����
