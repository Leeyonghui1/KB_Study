-- 1.
select * from student; 
commit;

-- 2. 
select * from student where age >= 10 and age < 20;
commit;

-- 3. �����λ���
delete from student where name='������';
commit;

-- 4. ������ ���� 20���� ����
update student set age=20 where name='������';
commit;