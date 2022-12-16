create table mydbhakgwa(
code char(3) primary key,
name varchar2(30)
);
-- �ٸ� ���̺��� �����Ϸ��� Į���� pk�� �����ؾ���

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
 
-- ��ճ���
select avg(age) from mydbstudent;
-- �а��� ��ճ���
select hakgwacode, avg(age) from mydbstudent group by hakgwacode;
-- �а��� ��� ���� ����ϵ�, ����(30�Ѵ�)�����ϴ� �͸� ǥ��
select hakgwacode, avg(age) from mydbstudent group by hakgwacode having avg(age)>30;


-- ��ø���� (���� �ִ� ������ ���)
select * from mydbstudent where age = (select max(age) from mydbstudent);

select mydbhakgwa.name, avgage from mydbhakgwa join (
select hakgwacode, avg(age) avgage from mydbstudent group by hakgwacode) a
on mydbhakgwa.code = a.hakgwacode;

-- SQL Plus���� ������������ view ���� ���� �ο��ؾ���
--grant create view to c##scott;

create view max_age as (select max(age) maxAge from mydbstudent);

select * from max_age; -- ������ ���̺� ��(view)
-- ��ø���� ��� ���� ���
-- select ���� �������� ��� �ܼ�ȭ�ϱ� ����
-- view�� ������ ������ �Ϲ������� �Ұ���������
-- Ư���� ��Ȳ�� ��, view�� Į���� ������ ���̺�� �����ϴٸ�
-- view�� �����͸� ����,���� ���� �ϸ� ������ ���̺� �����Ͱ��� ���Ѵ�

select * from mydbstudent where age=(select * from max_age);

-- �ֿ������� �а��� ����ҷ���
create view max_age_student as select * from mydbstudent where age=(select * from max_age);

select mydbhakgwa.name from max_age_student join mydbhakgwa on 
max_age_student.hakgwacode = mydbhakgwa.code;

commit;


