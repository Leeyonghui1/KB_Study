--2. ���� �л� ���̺��� �ִ� �� ���⿣ �İ��̶� ȭ���� �ִ�.
--�а� 1���� �� �߰��غ��� �� �а� ���� �л� 2�� �߰��غ�����.
insert into major values('���','103');
insert into student values('�躸��',20,'1234','103');
insert into student values('������',35,'12354','103');

--3. �а��ڵ尡 001�� �л��� �̸��� ���̸� ����غ�����.
select name, age from student where code='001';

--4. �а��ڵ尡 102(Ȥ�� 002)�� �л��� ���̸� ��� 20��� �����ϼ���.
update student set age=20 where code='002';
select * from student;

--5. ���� �̾��� �л��� ����������. (like ��� Ű���带 �̿��ؾ� �� ��)
delete from student where name like '��%';

-- ����
-- ���� ������
select max(age) from student;    -- ������ �� �ϳ��� Į������(age)���� �ִ� ���
delete from student where age = (select max(age) from student);