-- 1��
create table student(
name varchar2(20),
age number,
hakbeon varchar2(20) primary key);

insert into student (hakbeon,name,age) values('11','�ȼ���',19);
insert into student (hakbeon,name,age) values('12','������',15);
insert into student (hakbeon,name,age) values('13','�̹���',16);
insert into student (hakbeon,name,age) values('14','������',33);

select * from student;

-- 2�� ���̰� 10���� �л��� ��ȸ
select * from student where age >= 10 and age <=19;
select name from student where age > 9 and age < 20;   -- ���ǿ� �´� �̸��� ���
select name as �̸� from student where age > 9 and age < 20;  -- 'as'�� ����Ͽ� ���̺��� �÷����� ����
select name �̸� from student where age > 9 and age < 20;   -- 'as' ��������
select name as "�� ��" from student where age > 9 and age < 20; -- ������ �÷��� ����(����)�� ������ �ֵ���ǥ("")�� ���
select name "�� ��" from student where age > 9 and age < 20;   -- 'as' ��������


-- 3�� Ư�� ����(�̸�) �ش��ϴ� ������ ����
delete from student where name='��ȣ��';

-- 4�� Ư�� ����(�̸�) �ش��ϴ� ������ ����
insert into student values('����ȣ',10,'123');
update student set age=20 where name='����ȣ';
commit;
rollback;