create table Employee(
sabeon number primary key,
name varchar2(20) not null,
age int,
jikGeup varchar2(30),
HP varchar(13) unique   -- unique : �ߺ��� ������� ���� (PK ������) / null���� ����� (PK ������)
);
-- int = integer , number : �ε��Ҽ����� �����Ҽ��� ��������
select * from Employee;

insert into Employee values(1,'��ȣ��',30,'����',null);
insert into Employee values(001,'�̵���',34,'����','010-1234-5678');   -- number�ڷ��� ����  : 1 �� 001 ����
insert into Employee values(null,'�̵���',34,'����','010-1234-5678');  -- PK�� null���� ������� ����
insert into Employee values(101,'�̵���',34,'����','010-1234-5678');

insert into Employee (sabeon,name,age,jikgeup) values(2,'����ȣ',50,'ȸ��');
insert into Employee (hp,sabeon,name,age,jikgeup) values('010-111-1111',3,'����ȭ',40,'��ȸ��');

update Employee set age=20,hp='010-2222-2222' where sabeon=2;

select * from Employee order by sabeon;  -- ��� ��������
select * from Employee order by age desc;  -- ���� ��������

set autocommit on; -- �ڵ�Ŀ�Ա��
commit;
select name, jikgeup as ���� from Employee;