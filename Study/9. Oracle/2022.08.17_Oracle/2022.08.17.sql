-- ��� �����͸� ��ȸ�ϴ� �ڵ�
select * from student;  

-- where (����)  : ������ �����ϴ� �����͸� ã����
select * from student where age > 25;

-- SQL�� ���ǹ����� ������ üũ�� �� '='
select * from student where age > 25 and hakbeon='3';

-- ���ڿ��� ����ǥ'' ���̿� ���´�
insert into student (hakbeon, name, age) values ('1','�̿���',20);
  
-- SQL�� �ٽ�
-- CRUD
-- select = read = ��ȸ
-- insert = create = ����
-- update = ����
-- delete = ����

select * from student;  
update student set name='���¿�' where hakbeon='1';
delete from student where age=20;

commit; -- �߰�, ����, ������ ������ �� ������ �����ϴ°�
-- ���������� commit�� �������� ���ư� �� �ִ�

rollback; -- ���� ���������� Ŀ���� �������� ���ư���
delete from student;