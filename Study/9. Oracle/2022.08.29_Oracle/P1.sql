create table food
(
    num int primary key,
    name varchar2(50),
    price int
    );
    
-- ���̺�� �ڿ� �÷����� ��������
-- 1.��������� �÷����� �����ֱ� ���ؼ�
insert into food(num,name,price) values(1,'�Ұ��',7000);    
insert into food(num,name,price) values(2,'��ġ�',6000);
insert into food(num,name,price) values(3,'��������',6000);

-- 2. ���� ���ϴ� ������� ������ �ֱ� ���ؼ�
insert into food(price,num,name) values(10000,5,'Ȳ������');
-- 3. ���� ���ϴ� �����͸� �ֱ� ���ؼ�
insert into food(num,name) values(6,'����'); 

select * from food;

-- Ư�� column�� ���
select name, price from food;
select name from food;

-- food table�� column���� name������ ��½� �ѱ�(�޴�)�� ǥ�� ����
select name �޴� from food;

-- 6000����� ���� �� �ִ� ���� ���
select * from food where price >= 6000 and price < 7000;
select * from food where price between 6000 and 6999;

-- Ư�� ������ �ϳ��� ��ȸ�ؼ� ������ �� ����ϴ°� PK(primary key)
-- update���� ���ǻ���
-- where��(����)�� ������ �����ҷ��� �ߴ� �������� column(name)�� ����
-- ��� ������(�Ұ��,��ġ�,��������)�� �ϰ� ����ȴ�
update food set name='��ġ+����' where num = 3;
select * from food;

-- ���̺��� �÷������� �˰� ������� �����͸� �����Ŷ��
-- ���̺��� �÷��� ��������
insert into food values(4,'����ä',2000);

-- insert,update,delete���� �����ϴ°�
-- commit�� ���ϰ� ���α׷��� �����ϸ� �����ʹ� insert,update,delete ���� �������� ���ư�
commit;
